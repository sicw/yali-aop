import com.maoyan.demo.Advice;
import com.maoyan.demo.Advisor;
import com.maoyan.demo.AdvisorAdapter;
import com.maoyan.demo.MethodInterceptor;

/**
 * @author sichengwen
 * @date 2019/08/09
 */
public class MethodBeforeAdviceAdapter implements AdvisorAdapter {
    @Override
    public boolean supportAdvice(Advice advice) {
        return true;
    }

    @Override
    public MethodInterceptor getInterceptor(Advisor advisor) {
        return null;
    }
}
