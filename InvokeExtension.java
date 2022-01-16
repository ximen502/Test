public class InvokeExtension {

    public static void main(String[] args) {
        Raw t = new Raw();
        t.test();
        ExRawInfoKt.info(t);
        RawSub rs = new RawSub();
        rs.test();
        rs.sub();
        ExRawInfoKt.info(rs);
    }
}
