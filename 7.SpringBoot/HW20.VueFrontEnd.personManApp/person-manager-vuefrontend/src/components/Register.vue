<template>
    <main role="main" class="container">
        <h1 class="mt-5">Register new person </h1>
        <p class="lead">Please provide all neccessary information here!</p>

        <form action="#" th:action="@{/addOrUpdate}" method="post" name="person" enctype="multipart/form-data"
              th:object="${person}">
            <input type="hidden" placeholder="id" th:field="*{id}"/><br><br>
            <div class="form-group row mt-3">
                <label for="fullName" class="col-sm-2 col-form-label">Name</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="fullName" th:field="*{fullName}"/>
                </div>
                <div class="text-danger" th:if="${#fields.hasErrors('fullName')}" th:errors="*{fullName}">Name Error</div>
            </div>

            <div class="input-group mt-3 row">
                <label for="inputGroupSelect03" class="col-sm-2 col-form-label" >Job</label>
                <div class="col-sm-8">
                    <select class="custom-select" id="inputGroupSelect03" th:field="*{job}">
                        <block th:each="job : ${jobs}">
                            <option th:value="${job}" th:text="${job}">One</option>
                        </block>
                    </select>
<!--                    to job list-->
                    <a th:href="@{/jobList}">
                        <i class="fas fa-plus-circle"></i>
                    </a>
                </div>
                <div class="text-danger" th:if="${#fields.hasErrors('job')}" th:errors="*{job}">Email Error</div>
            </div>

            <div class="form-group row mt-3">
                <label for="birthdate" class="col-sm-2 col-form-label">Gender</label>
                <div class="form-check form-check-inline col-sm-2">
                    <input class="form-check-input" type="radio" name="gender" id="male" th:value="true" th:field="*{gender}">
                    <label class="form-check-label" for="male">Male</label>
                </div>
                <div class="form-check form-check-inline col-sm-2">
                    <input class="form-check-input" type="radio" name="gender" id="female" th:value="false" th:field="*{gender}">
                    <label class="form-check-label" for="female">Female</label>
                </div>
            </div>

            <div class="form-group row mt-3">
                <label for="birthdate" class="col-sm-2 col-form-label">Date of birth</label>
                <div class="col-sm-4">
                    <input type="date" class="form-control" id="birthdate" autocomplete="off" th:field="*{birthDate}"
                           name="birthDate"
                           />
                </div>
                <div class="text-danger" th:if="${#fields.hasErrors('birthDate')}" th:errors="*{birthDate}">Gender Error</div>
            </div>


            <div class="form-group row mt-3">
                <label class="col-sm-2 col-form-label">Select a photo</label>
                <div class="col-sm-4">
                    <input type="file" class="form-control"/>
                </div>
                <!-- <div class="text-danger"  th:if="${#fields.hasErrors('photo')}" th:errors="*{photo}">Upload Error</div> -->
            </div>
            <button class="btn btn-primary mt-3" type="submit">Submit form</button>
        </form>

    </main>

</template>