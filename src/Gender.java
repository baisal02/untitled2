public enum Gender {
    MALE("i'm male"),FEMALE("i'm female");
    public String deviz;
    Gender(String deviz){
        this.deviz=deviz;
    }

    public String getDeviz() {
        return deviz;
    }

    public void setDeviz(String deviz) {
        this.deviz = deviz;
    }
}
