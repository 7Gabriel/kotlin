package odelia.micronaut.jpa.kotlin.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0017\u0010\u0010\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0014J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0017J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lodelia/micronaut/jpa/kotlin/controller/GenreController;", "", "genreRepository", "Lodelia/micronaut/jpa/kotlin/repository/GenreRepository;", "(Lodelia/micronaut/jpa/kotlin/repository/GenreRepository;)V", "getGenreRepository", "()Lodelia/micronaut/jpa/kotlin/repository/GenreRepository;", "delete", "Lio/micronaut/http/HttpResponse;", "id", "", "list", "", "Lodelia/micronaut/jpa/kotlin/domain/Genre;", "args", "Lodelia/micronaut/jpa/kotlin/SortingAndOrderArguments;", "location", "Ljava/net/URI;", "(Ljava/lang/Long;)Ljava/net/URI;", "genre", "save", "cmd", "Lodelia/micronaut/jpa/kotlin/GenreSaveCommand;", "show", "update", "command", "Lodelia/micronaut/jpa/kotlin/GenreUpdateCommand;", "odelia-micronaut-jpa-kotlin"})
@io.micronaut.http.annotation.Controller(value = "/genres")
@io.micronaut.validation.Validated()
public class GenreController {
    @org.jetbrains.annotations.NotNull()
    private final odelia.micronaut.jpa.kotlin.repository.GenreRepository genreRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public odelia.micronaut.jpa.kotlin.domain.Genre show(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "/")
    public io.micronaut.http.HttpResponse<java.lang.Object> update(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    odelia.micronaut.jpa.kotlin.GenreUpdateCommand command) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/list{?args*}")
    public java.util.List<odelia.micronaut.jpa.kotlin.domain.Genre> list(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    odelia.micronaut.jpa.kotlin.SortingAndOrderArguments args) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/")
    public io.micronaut.http.HttpResponse<odelia.micronaut.jpa.kotlin.domain.Genre> save(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    odelia.micronaut.jpa.kotlin.GenreSaveCommand cmd) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> delete(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.net.URI location(@org.jetbrains.annotations.Nullable()
    java.lang.Long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.net.URI location(@org.jetbrains.annotations.NotNull()
    odelia.micronaut.jpa.kotlin.domain.Genre genre) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected odelia.micronaut.jpa.kotlin.repository.GenreRepository getGenreRepository() {
        return null;
    }
    
    public GenreController(@org.jetbrains.annotations.NotNull()
    odelia.micronaut.jpa.kotlin.repository.GenreRepository genreRepository) {
        super();
    }
}