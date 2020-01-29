import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberBreakdownTest {

    @Test
    public void zero_Should_Return_Array_Of_Zero(){
        assertThat(new NumberBreakdown(456).breakDown()).isEqualTo(new int[][]{{4,2},{5,1},{6,0}});
    }
}
