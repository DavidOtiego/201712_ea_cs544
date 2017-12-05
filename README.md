Goal: To create a database and the data access objects (DAOs) for a system to register volunteering projects and recruit for volunteers. There will be two types of roles: Administrators and Volunteers:
1.	Should be able to:
    1.	create a project with a description, location, and timeframe (expected start and end dates)
    2.	Manage (add, delete, update) the tasks required to be done in a project. Each task should have a timeframe, status of the tasks,  indicate what type of resources are required for each task (i.e, what skill if it is a volunteer or an asset that is required; include how many resources of that type are required).
    3.	The projects may have a list of beneficiaries.
    4.	Should be able to load html files to enhance the description of the project and beneficiaries information.
2.	Volunteers should be able to offer their services for tasks on projects (satisfy the need of a resource).
3.	List information about projects and their beneficiaries
4.	List tasks for a project
5.	List projects by status
6.	Look for projects that requires a particular type of resource
7.	Search projects by keywords and location
8.	List projects and tasks where a volunteer have offered services, ordered by date of the task.

You don't have to create the whole system, just the domain with the services to provide the CRUD operations and queries to satisfy the requirements listed above.  Create test cases (JUnit or TestNG) to validate that you are able to run the queries that were specified on the previous list.
