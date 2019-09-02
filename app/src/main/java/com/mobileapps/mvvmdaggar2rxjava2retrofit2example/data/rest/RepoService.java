package com.mobileapps.mvvmdaggar2rxjava2retrofit2example.data.rest;

import com.mobileapps.mvvmdaggar2rxjava2retrofit2example.data.model.Repo;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RepoService
{

    @GET("orgs/Google/repos")
    Single<List<Repo>> getRepositories();

    @GET("repos/{owner}/{name}")
    Single<Repo> getRepo(@Path("owner") String owner, @Path("name") String name);
}
