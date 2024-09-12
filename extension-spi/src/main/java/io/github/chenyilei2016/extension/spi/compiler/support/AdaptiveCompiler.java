package io.github.chenyilei2016.extension.spi.compiler.support;


import io.github.chenyilei2016.extension.spi.ExtensionAdaptive;
import io.github.chenyilei2016.extension.spi.ExtensionLoader;
import io.github.chenyilei2016.extension.spi.compiler.Compiler;

/**
 * AdaptiveCompiler. (SPI, Singleton, ThreadSafe)
 */
@ExtensionAdaptive
public class AdaptiveCompiler implements Compiler {

    private static volatile String DEFAULT_COMPILER;

    public static void setDefaultCompiler(String compiler) {
        DEFAULT_COMPILER = compiler;
    }

    @Override
    public Class<?> compile(String code, ClassLoader classLoader) {
        Compiler compiler;
        ExtensionLoader<Compiler> loader = ExtensionLoader.getExtensionLoader(Compiler.class);
        // copy reference
        String name = DEFAULT_COMPILER;
        if (name != null && name.length() > 0) {
            compiler = loader.getExtension(name);
        } else {
            compiler = loader.getDefaultExtension();
        }
        return compiler.compile(code, classLoader);
    }

}
