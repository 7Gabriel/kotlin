package odelia.micronaut.jpa.kotlin.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lodelia/micronaut/jpa/kotlin/repository/GenreRepositoryImpl;", "Lodelia/micronaut/jpa/kotlin/repository/GenreRepository;", "entityManager", "Ljavax/persistence/EntityManager;", "applicationConfiguration", "Lodelia/micronaut/jpa/kotlin/config/ApplicationConfiguration;", "(Ljavax/persistence/EntityManager;Lodelia/micronaut/jpa/kotlin/config/ApplicationConfiguration;)V", "deleteById", "", "id", "", "findAll", "", "Lodelia/micronaut/jpa/kotlin/domain/Genre;", "args", "Lodelia/micronaut/jpa/kotlin/SortingAndOrderArguments;", "findById", "save", "name", "", "update", "", "Companion", "odelia-micronaut-jpa-kotlin"})
@javax.inject.Singleton()
public class GenreRepositoryImpl implements odelia.micronaut.jpa.kotlin.repository.GenreRepository {
    @javax.persistence.PersistenceContext()
    private final javax.persistence.EntityManager entityManager = null;
    private final odelia.micronaut.jpa.kotlin.config.ApplicationConfiguration applicationConfiguration = null;
    private static final java.util.List<java.lang.String> VALID_PROPERTY_NAMES = null;
    public static final odelia.micronaut.jpa.kotlin.repository.GenreRepositoryImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    @io.micronaut.spring.tx.annotation.Transactional(readOnly = true)
    public odelia.micronaut.jpa.kotlin.domain.Genre findById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @io.micronaut.spring.tx.annotation.Transactional()
    public odelia.micronaut.jpa.kotlin.domain.Genre save(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    @io.micronaut.spring.tx.annotation.Transactional()
    public void deleteById(long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @io.micronaut.spring.tx.annotation.Transactional(readOnly = true)
    public java.util.List<odelia.micronaut.jpa.kotlin.domain.Genre> findAll(@org.jetbrains.annotations.NotNull()
    odelia.micronaut.jpa.kotlin.SortingAndOrderArguments args) {
        return null;
    }
    
    @java.lang.Override()
    @io.micronaut.spring.tx.annotation.Transactional()
    public int update(long id, @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String name) {
        return 0;
    }
    
    public GenreRepositoryImpl(@org.jetbrains.annotations.NotNull()
    @io.micronaut.configuration.hibernate.jpa.scope.CurrentSession()
    javax.persistence.EntityManager entityManager, @org.jetbrains.annotations.NotNull()
    odelia.micronaut.jpa.kotlin.config.ApplicationConfiguration applicationConfiguration) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lodelia/micronaut/jpa/kotlin/repository/GenreRepositoryImpl$Companion;", "", "()V", "VALID_PROPERTY_NAMES", "", "", "kotlin.jvm.PlatformType", "", "odelia-micronaut-jpa-kotlin"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}