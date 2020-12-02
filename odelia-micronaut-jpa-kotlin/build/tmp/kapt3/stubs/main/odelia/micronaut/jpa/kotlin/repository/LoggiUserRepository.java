package odelia.micronaut.jpa.kotlin.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000eH&J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0011"}, d2 = {"Lodelia/micronaut/jpa/kotlin/repository/LoggiUserRepository;", "", "deleteById", "", "id", "", "findAll", "", "Lodelia/micronaut/jpa/kotlin/domain/LoggiUser;", "args", "Lodelia/micronaut/jpa/kotlin/SortingAndOrderArguments;", "findById", "save", "name", "", "update", "", "odelia-micronaut-jpa-kotlin"})
public abstract interface LoggiUserRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract odelia.micronaut.jpa.kotlin.domain.LoggiUser findById(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract odelia.micronaut.jpa.kotlin.domain.LoggiUser save(@org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String name);
    
    public abstract void deleteById(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<odelia.micronaut.jpa.kotlin.domain.LoggiUser> findAll(@org.jetbrains.annotations.NotNull()
    odelia.micronaut.jpa.kotlin.SortingAndOrderArguments args);
    
    public abstract int update(long id, @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String name);
}