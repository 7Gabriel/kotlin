package odelia.micronaut.jpa.kotlin.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004@VX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lodelia/micronaut/jpa/kotlin/config/ApplicationConfigurationProperties;", "Lodelia/micronaut/jpa/kotlin/config/ApplicationConfiguration;", "()V", "DEFAULT_MAX", "", "getDEFAULT_MAX", "()I", "max", "getMax", "()Ljava/lang/Integer;", "setMax", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "odelia-micronaut-jpa-kotlin"})
@io.micronaut.context.annotation.ConfigurationProperties(value = "application")
public final class ApplicationConfigurationProperties implements odelia.micronaut.jpa.kotlin.config.ApplicationConfiguration {
    private final int DEFAULT_MAX = 10;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer max;
    
    protected final int getDEFAULT_MAX() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getMax() {
        return null;
    }
    
    public void setMax(@org.jetbrains.annotations.Nullable()
    java.lang.Integer max) {
    }
    
    public ApplicationConfigurationProperties() {
        super();
    }
}