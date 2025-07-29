package exce;

public class StringExce extends RuntimeException{

    @Override
    public String getMessage() {
        return super.getMessage() + "自定义的字符串异常";
    }
}
