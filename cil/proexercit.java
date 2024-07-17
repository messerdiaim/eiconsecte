public interface MessageDecoder<MessageType> {
    public ParameterMap decode(MessageType encoded) throws EncodingException;
}
