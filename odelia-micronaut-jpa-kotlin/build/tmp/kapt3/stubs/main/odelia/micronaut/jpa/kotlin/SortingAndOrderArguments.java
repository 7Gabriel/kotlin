package odelia.micronaut.jpa.kotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lodelia/micronaut/jpa/kotlin/SortingAndOrderArguments;", "", "offset", "", "max", "sort", "", "order", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getMax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffset", "getOrder", "()Ljava/lang/String;", "getSort", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lodelia/micronaut/jpa/kotlin/SortingAndOrderArguments;", "equals", "", "other", "hashCode", "toString", "odelia-micronaut-jpa-kotlin"})
public final class SortingAndOrderArguments {
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.PositiveOrZero()
    private final java.lang.Integer offset = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Positive()
    private final java.lang.Integer max = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Pattern(regexp = "id|name")
    private final java.lang.String sort = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Pattern(regexp = "asc|ASC|desc|DESC")
    private final java.lang.String order = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOffset() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSort() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrder() {
        return null;
    }
    
    public SortingAndOrderArguments(@org.jetbrains.annotations.Nullable()
    java.lang.Integer offset, @org.jetbrains.annotations.Nullable()
    java.lang.Integer max, @org.jetbrains.annotations.Nullable()
    java.lang.String sort, @org.jetbrains.annotations.Nullable()
    java.lang.String order) {
        super();
    }
    
    public SortingAndOrderArguments() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final odelia.micronaut.jpa.kotlin.SortingAndOrderArguments copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer offset, @org.jetbrains.annotations.Nullable()
    java.lang.Integer max, @org.jetbrains.annotations.Nullable()
    java.lang.String sort, @org.jetbrains.annotations.Nullable()
    java.lang.String order) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}