package com.integriks.smev.nwxRewrite.client.src.clientApi.services.template;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.SMEVMessage;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.SMEVMetadata;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.processing.QueryInformation;
import com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.*;

import java.util.Map;


/**
 * Шаблон взаимодействия со СМЭВ
 */
public interface WSTemplate {

    /**
     * Получение сообщения (любого типа - запрос/ответ/...) от СМЭВ.
     *
     * @param query фильтр сообщений
     * @return полученное сообщение
     * @throws SMEVException в случае любой ошибки
     */
    SMEVMessage get(QueryInformation query) throws SMEVException;


    /**
     */
    GetResponseRequest getResponseRequest(QueryInformation query, String timestamp) throws Exception;


    /**
     */
    GetRequestRequest getRequestRequest(QueryInformation query, String timestamp) throws Exception;

    /**
     */
    GetStatusRequest getStatusRequest(String timestamp) throws Exception;

    /**
     * Отправка сообщение в СМЭВ
     *
     * @param message сообщение для отправки
     * @return метаданные отправленного сообщения
     * @throws SMEVException в случае любой ошибки
     */
    SMEVMetadata send(SMEVMessage message) throws SMEVException;

    /**
     * Подтверждает получение сообщения
     *
     * @param metadata метаданные полученного сообщения
     * @param accepted true - сообщение принято для обработки, false - сообщение отклонено
     * @throws SMEVException в случае любой ошибки
     */
    void ack(SMEVMetadata metadata, boolean accepted) throws SMEVException;

    /**
     */
    AckRequest getAckRequest(SMEVMetadata metadata, boolean accepted) throws SMEVException;


    /**
     * Формирует ЭП-ОВ для сообщения и добавляет её в объект запроса
     * https://rm.mfc.ru/issues/9182, Разработка кода подписания, 13.02.2018, imironov
     *
     * @param message сообщение для подписи
     * @return подписанное сообщение
     * @throws SMEVException в случае любой ошибки
     */
    SendRequestRequest sign(SMEVMessage message) throws SMEVException;


    /**
     *
     * @param message
     * @return
     * @throws SMEVException
     */
    SendResponseRequest getSendResponseRequest(SMEVMessage message) throws SMEVException;

    /**
     * Получает статистику по JMS-очередям текущего клиента
     *
     * @param nodeId идентификатор узла СМЭВ
     * @return количество сообщений в каждой очереди
     * @throws SMEVException в случае любой ошибки
     */
    public Map<String, Long> getIncomingQueueStatistics(String nodeId) throws SMEVException;

    /**
     * Получает статистику по JMS-очередям текущего клиента
     *
     * @param nodeId идентификатор узла СМЭВ
     * @param timestamp - ?
     * @return - ?
     * @throws SMEVException в случае любой ошибки
     */
    public GetIncomingQueueStatisticsRequest getIncomingQueueStatistics(String nodeId, String timestamp) throws Exception;


    //public SendResponseRequest getRejectResponseRequest(SMEVMessage message) throws SMEVException;
}
