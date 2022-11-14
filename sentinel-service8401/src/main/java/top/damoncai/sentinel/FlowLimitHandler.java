package top.damoncai.sentinel;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * <p>
 *
 * </p>
 *
 * @author zhishun.cai
 * @since 2022/9/20 9:43
 */
public class FlowLimitHandler {

    public static String testCHandler(BlockException exception) {
        return "流控 testCHandler ~~~";
    }
}
