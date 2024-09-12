package io.github.chenyilei2016.extension.spi.kernel.function;

/**
 * 回调--无参数的函数对象<br>
 * 一个函数接口代表一个一个函数，用于包装一个函数为对象<br>
 * MyCharUtils
 *
 * @param <R> 返回值类型
 */
@FunctionalInterface
public interface Callback<R> {
    /**
     * 执行函数
     *
     * @return 函数执行结果
     */
    R apply();
}
