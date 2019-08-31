package test;

/**
 * Created by Sanal on 3/29/2019.
 */
public final class ABean {

    private String str1 = null;
    private String str2 = null;
    private String str3 = null;
    private String str4 = null;

    @Override
    public String toString() {
        return str1.concat(str2).concat(str3).concat(str4).toString();
    }

    public ABean(ABeanBuilder builder) {
        str1 = builder.str1;
        str2 = builder.str2;
        str3 = builder.str3;
        str4 = builder.str4;
    }

    public static class ABeanBuilder {
        private String str1;
        private String str2;
        private String str3;
        private String str4;

        public ABeanBuilder str1(String str1) {
            this.str1 = str1;
            return this;
        }

        public ABeanBuilder str2(String str2) {
            this.str2 = str2;
            return this;
        }

        public ABeanBuilder str3(String str3) {
            this.str3 = str3;
            return this;
        }

        public ABeanBuilder str4(String str4) {
            this.str4 = str4;
            return this;
        }

        public ABean build() {
            return new ABean(this);
        }
    }
}