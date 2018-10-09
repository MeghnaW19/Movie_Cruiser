the complete code is in two parts:

**frontend**

    angular 4 , bootstrap  

**server**

    spring-boot -v 1.5.8 , restful services , spring JpaRepository , mysql

have removed the DAO layer and added the Spring Jpa Repository

api's :

    user:

        post:   localhost:8080/user/register

        {
            "userId":"chandu",
            "firstName":"chandan",
            "lastName":"mishra",
            "password":"123"
        }

        post:   localhost:8080/user/login

        {
            "userId":"chandu",
            "password":"123"
        }


        output: 

        {
            "message": "user successfully logged in",
            "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFuZHUiLCJpYXQiOjE1MjAzMTQ0MzF9.56NwXvLov4FxtHSs8a741kSXpPVjFiUPnoW5595WPqI"
        }

movie:

    post:   localhost:8080/v1.0/movieservice/movie

    Authorization Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFuZHUiLCJpYXQiOjE1MjAzMTQ0MzF9.56NwXvLov4FxtHSs8a741kSXpPVjFiUPnoW5595WPqI

        {
            "name":"Bawarchi",
            "comments":"good movie",
            "posterPath":"xyz",
            "releaseDate":"1965",
            "voteAverage":"65",
            "voteCount":"28374",
            "userId":"ashu"
        }

    put:    localhost:8080/v1.0/movieservice/movie/update/0

        bad movie

        output

        {
            "id": 0,
            "name": "Bawarchi",
            "comments": "good movie",
            "posterPath": "xyz",
            "releaseDate": "1965",
            "voteAverage": 65,
            "voteCount": 28374,
            "userId": "ashu"
        }

    delete:     localhost:8080/v1.0/movieservice/movie/delete/0

        output: movie deleted successfully

    get movie by id:

        get:     localhost:8080/v1.0/movieservice/movie/get/0

        output:

        {
            "id": 0,
            "name": "Bawarchi",
            "comments": "good movie",
            "posterPath": "xyz",
            "releaseDate": "1965",
            "voteAverage": 65,
            "voteCount": 28374,
            "userId": "ashu"
        }

    getAll:

        get:    localhost:8080/v1.0/movieservice/movie/

        success

    getMyMovies:

        get:    localhost:8080/v1.0/movieservice/movie/mymovies

        success

