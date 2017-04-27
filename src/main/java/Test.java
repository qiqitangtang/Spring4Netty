import lombok.*;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description:
 * @Date: Create in 13:39 2017/4/27
 * @Modified By:
 */
@AllArgsConstructor
@ToString
public class Test {

    @Getter
    @Setter(AccessLevel.PRIVATE)
    private int num;
    private String name;

    public static void main(String[] args) {
        Test test = new Test(1,"12");
        System.out.println(test.getNum());
        System.out.println(test);
    }
}
