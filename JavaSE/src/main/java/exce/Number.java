package exce;

public enum Number {
    BIG(1, "大"),
    MEDIUM(2, "中"),
    SMALL(3, "小");

    private Integer num;
    private String spec;

    private Number(Integer num, String spec) {
        this.num = num;
        this.spec = spec;
    }


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }


    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
