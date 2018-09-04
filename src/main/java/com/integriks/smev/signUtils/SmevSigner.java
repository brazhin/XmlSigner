package com.integriks.smev.signUtils;

/**
 * SmevSigner.java
 * https://rm.mfc.ru/issues/9182, Разработка кода подписания, 13.02.2018, imironov
 */

/**
 * Для формирования подписанного запроса для СМЭВ.
 */
public class SmevSigner {

    /**
     * Получает запрос без подписи и формирует подписанный запрос для СМЭВ.
     *
     * @param xmlWithoutSign
     * @return - Подписанный ЭП-ОВ запрос SendRequestRequest для СМЭВ.
     * @throws Exception
     */
    public String SignMessage(String xmlWithoutSign) throws Exception {

        return xmlWithoutSign;
//        GeoTemplateConfiguration geoConfig = ToolConfiguration.getDefault().getGeoTemplateConfiguration();
//
//        Template template = null;
//        template = Factory.getTemplateInstance(geoConfig);
//
//        List<File> mtomAttachments = getMtomAttachments(xmlWithoutSign);
//        List<File> largeAttachments = getLargeAttachments(xmlWithoutSign);
//
//        String SERVER_API_PACKAGE = "ru.voskhod.smev.server.autogenerated.types:ru.voskhod.smev.server.autogenerated.types.basic:ru.voskhod.smev.server.autogenerated.types.fault";
//
//        TransformerFactory transFactory = TransformerFactory.newInstance();
//        Transformer transformer = transFactory.newTransformer();
//        StringWriter buffer = new StringWriter();
//        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "false");
//
//        ThreadLocal<JAXBContext> jaxbContext = new ThreadLocal<>();
//        if (jaxbContext.get() == null) {
//            try {
//                jaxbContext.set(JAXBContext.newInstance(SERVER_API_PACKAGE));
//            } catch (JAXBException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        DOMResult domResult = new DOMResult();
//
//        String requestType = getRequestType(xmlWithoutSign);
//        logger.info("RequestType: " + requestType);
//
//        if (requestType == "SendRequestRequest") {
//
//            String nodeId = getNodeId(xmlWithoutSign);
//            boolean isTestMessage = getTest(xmlWithoutSign);
//
//            SendRequestRequest request = template.getRequestMessage(nodeId, getMessageId(xmlWithoutSign), null, null, null,
//                    null, null, fileToElement(getMessagePrimaryContent(xmlWithoutSign)),
//                    null, mtomAttachments, largeAttachments, null, isTestMessage);
//
//            jaxbContext.get().createMarshaller().marshal(request, domResult);
//
//        } else if (requestType == "GetIncomingQueueStatisticsRequest") {
//
//            String timestamp = getTimestamp(xmlWithoutSign);
//            GetIncomingQueueStatisticsRequest queueStatisticsRequest = template.getIncomingQueueStatistics(null, timestamp);
//            jaxbContext.get().createMarshaller().marshal(queueStatisticsRequest, domResult);
//
//        } else if (requestType == "SendResponseRequest") {
//            String replayToAddress = getReplyAddress(xmlWithoutSign);
//            if (isContentMessage(xmlWithoutSign)) {
//                SendResponseRequest sendResponseRequest = template.getSendResponseRequestMessage(getMessageId(xmlWithoutSign), replayToAddress, null,
//                        null, fileToElement(getMessagePrimaryContent(xmlWithoutSign)),
//                        null, mtomAttachments, largeAttachments, null);
//                jaxbContext.get().createMarshaller().marshal(sendResponseRequest, domResult);
//            } else if (isStatusMessage(xmlWithoutSign)) {
//                int code = getStatusCode(xmlWithoutSign);
//                String description = getStatusDescription(xmlWithoutSign);
//                SendResponseRequest sendResponseRequest = template.getStatusResponseMessage(getMessageId(xmlWithoutSign), replayToAddress, null, code, description, null, null);
//                jaxbContext.get().createMarshaller().marshal(sendResponseRequest, domResult);
//            } else if (isRejectMessage(xmlWithoutSign)) {
//                String code = getRejectionReasonCode(xmlWithoutSign);
//                String description = getRejectionReasonDescription(xmlWithoutSign);
//                SendResponseRequest sendResponseRequest = template.getRejectResponseMessage(getMessageId(xmlWithoutSign), replayToAddress, null, code, description, null);
//                jaxbContext.get().createMarshaller().marshal(sendResponseRequest, domResult);
//            }
//        } else if (requestType == "GetResponseRequest") {
//
//            String timestamp = getTimestamp(xmlWithoutSign);
//            String nodeId = getNodeId(xmlWithoutSign);
//            GetResponseRequest responseRequest = template.getResponseMessage(null, nodeId, timestamp);
//            jaxbContext.get().createMarshaller().marshal(responseRequest, domResult);
//
//        } else if (requestType == "GetRequestRequest") {
//
//            String timestamp = getTimestamp(xmlWithoutSign);
//            String nodeId = getNodeId(xmlWithoutSign);
//            GetRequestRequest requestRequest = template.getRequestRequest(null, nodeId, timestamp);
//            jaxbContext.get().createMarshaller().marshal(requestRequest, domResult);
//
//        } else if (requestType == "AckRequest") {
//
//            String targetMessageId = getTargetMessageId(xmlWithoutSign);
//            AckRequest ackRequest = template.getAckRequest(targetMessageId);
//            jaxbContext.get().createMarshaller().marshal(ackRequest, domResult);
//
//        } else if (requestType == "GetStatusRequest") {
//
//            String timestamp = getTimestamp(xmlWithoutSign);
//            GetStatusRequest statusRequest = template.getStatusRequest(timestamp);
//            jaxbContext.get().createMarshaller().marshal(statusRequest, domResult);
//
//        }
//
//        transformer.transform(new DOMSource(((Document) domResult.getNode()).getDocumentElement()),
//                new StreamResult(buffer));
//
//        String messageResult = buffer.toString();
//
//        return messageResult;
    }

}
