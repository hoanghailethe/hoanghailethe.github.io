<template>

    <main>
        <div class="container">
            <div class="row">
                <div class="col-lg-10 mt-5 mb-5">
                    <h1 class="mt-5">All Job available </h1>
                    <p class="lead">You can add a new career</p>

                    <form th:action="@{/jobList}" th:object="${newJob}"  method="post">
                        <div class="row mt-4">
                            <div class="col-4 mt-3">
                                <input type="text" class="form-control" placeholder="Add a new Job" th:field="*{jobName}">
                            </div>
                            <button type="submit" class="btn btn-primary col-2 mt-3">Add</button>
                        </div>
                    </form>

                    <table class="table table-bordered table-responsive" style="width: 100%">
                        <thead>
                        <tr>
                            <th scope="col">Jobs available</th>
                        </tr>
                        </thead>
                        <tbody  th:each="job: ${jobs}">
                        <tr>
                            <th scope="row" th:text="${job}"></th>
                            <td>
                                <a class="btn btn-danger" th:href="@{delete/{job}(job=${job})}">Delete</a>
                            </td>
                        </tr>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </main>
</template>

<script>

</script>
