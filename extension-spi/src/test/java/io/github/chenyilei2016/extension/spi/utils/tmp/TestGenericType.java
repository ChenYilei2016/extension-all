package io.github.chenyilei2016.extension.spi.utils.tmp;


/**
 * @author chenyilei
 * 2023/09/25 15:24
 */
public class TestGenericType<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TestGenericType{" +
                "data=" + data +
                '}';
    }
}
