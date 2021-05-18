
## VPC FUNDAMENTALS

### VPC OBJECTS 
In GCP vpc is a global constract, a global container with in which subnets live. 
You create a global VPC and create regional subnets 
A vm in a subnet in US-west and talk to another subnet is US-east internally 
One global networking space to simplify vpc design 
- Projects 
    + Associate Objects and services with billing
- Networks
    + Default, automode, custom
    + Networks can be shared/peered
- IP addresses
- Virtual Machines
- Routes 
- Firewall rules







## BIGTABLE VS BIGQUERY

_BIGQUERY_

- BigQuery is a query engine for datasets that don't change much or change by appending. 
- Its a great choice when your queries require a "table scan" or the need to look entire data base
- Think sums or counts or aggregations. 


_BIGTABLE_
- Bigtable is a database. its is designed to be the foundations for a large, scalable application. Use Bigtable when you are making any kind of app that needs to read and write data, and scalae is potential issue

![https://cloud.google.com/images/storage-options/flowchart.svg]


## CLOUD LAB ESSENTIALS

[Cloud lab essentials](https://s3.amazonaws.com/assessment_engine/production/labs/1820/lab_diagram_GC%20Essentials%20Labs%20-%20App%20Engine.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIA3ETCCTRFAB53AABQ%2F20201215%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20201215T135346Z&X-Amz-Expires=3600&X-Amz-SignedHeaders=host&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEFEaCXVzLWVhc3QtMSJGMEQCIF%2Bm89%2FlC1Qvz0FqNq1kJX80UyTLEM%2Brw%2BFKv309X1pAAiA4xv%2FOVaNGL%2BII16ZNaTGm0DAl9XbagcJDZoUbj1WX6yqoAwjq%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAAaDDc2NTc4MzYxMjQ5MCIMBcurJfUHwyNfaEyqKvwCtcD5Z3Rpv6pOcKuRb38XlSDys3aSq3xg1SiaHzRONJsBAWjDx8mJo23ya8emN7phwsYhVYUJuD8ZIZiyEF68LIJCoB2uuHARTtvvVj%2FgLmuqYY24aRWZ9Vic5lAkVjBCJDVlfiaOfWU4uRinqMlvmbIWdyNTxKggFIJ12Vc1kFb7eaP2CO%2FH0mKFsT5XOaXP7hQxrQ2xoGwOPRmBDYmNWzZd6yMerwFPm02ZJcYXZRoG8F3D%2F6WZtjqJILBb10xPwvTIDiR%2BQd%2FQ268Ko%2BY%2Bv4Yyd9Cbh%2FQaf730iwLaiHOY6QUeUaAkq7eGEMr%2BbsfAY9xEoxBPuOANAvj68YcUU50GSRW82cBMzd%2Fq9239n2XHnzF8HswZqfKNMM6o8FtZTKwwzbTIsex%2B1sNBBAV9EG1mn%2FxhZoQQxMuPCtCIwJFN93hKLrspTluj5LrzQcthvnYZU6djN%2FOdTOrfRNpeoCG%2B1wiLY8TO6PMAi1bIFn0tr%2FOoiDgTdJgPqxowr%2FTh%2FgU67AEORPyxJJVv6nMemDRLw%2FPC79qjziwPRk3gqS1%2BMejIwBGikZpWinXjUz2XjNTKxiWynN9TTIja%2BZuaXDPlJEkwAuPdHxy26e2ZWIoPtsRc980LtnJC3Ca0ckAh0bK6%2FcIx2wtVjPmLinyNeIWBYFSuLcpc4zFKs9SZz13v3A8YxAVHih3I7aW7gahWvcKj4rMtdsWyCQifbgN7bjhqU3wpEqowMFnssp8zz3lZ1oAtwEkVC%2BBYagvtHJpR7XdMGId%2Fq52p99DyyVlZ327B%2FGeNCZUJ%2F9ZmAcFdUjeZFRX1gwrVh9UUVZ1%2BGWhgXQ%3D%3D&X-Amz-Signature=50af3c7a08cd08e67a2a5a733ce41237408c39d37228d2b5fa439c55dc967da1)


## RESOURCE MANAGER/Hierarchy
- Manage resources by Projects
- resources inherit policies from parents 
- Hierarchically manage resource by project, folder and organisation
- Create an organization that contains all the projects and resources
- Create folders to group projects by departments, team, application
- PROJECTID 
    + Globally Unique 
    + Chosen by you 
    + Immutable
    
- PROJECTNAME
    + Need not to be unique 
    + Chosen by you
    + mutable
 
- PROJECTNUMBER
    + Globally unique
    + Assigned by GCP 
    + immutable

## IAM 
- IAM lets you control who(users) has access what access(role) to which resources by setting 
- Who can do what on which resource. 
- every cloud method requires that the account making the API request has appropriate permissions to access the resource 
- IAM Policies can apply to any of four types of principles
- `resourcemanager.projects.list` permisions allows a users to list the project they own
- roles have one or more permission bundled together


## PERMISSIONS
- Specifies who can do what on a certain resource
- <Service>.<Resource>.<Verb>
    ```
    List of Permissions
    compute.instance.delete
    compute.instance.get 
    compute.instance.list
    compute.instance.setMachineType
    compute.instance.start
    compute.instance.stop
    ```

## Roles 
- is an abstraction to grouping permissions
- Three types of roles 
    + Primitive roles 
        * Owner
        * editor
        * viewer
    + Predefined roles
        * Hundreds of roles
    + Custom roles 
        * Create from scratch or from Existing roles 
        * create by either combining or removing permissions from pre-defined roles 

## Binding and Policy







## gcloud 
-  gcloud auth list 
    + lists the active account 
-  gcloud config list project
-  gcloud config get-value compute/region
-  gcloud config get-value compute/zone
-  gcloud compute project-info describe --project <your_project_ID>
-  gcloud compute instances create gcelab2 --machine-type n1-standard-2 --zone $ZONE
-  gcloud compute instances list
-  gcloud -h for more verbose help gcloud --help 
-  gcloud components list 
    +  Gives the list of components 

## google compute engine
- google cloud resources either live in a region or zone
- resources that live in a zone are called zonal resources 
- virtual machine and persistant disks live in a zone

## GCP storage options 

- binary large-object storage (Unstructured data)
    + Store arbitary bunch of bytes here 
    + Its not a block storage where it store bunch of blocks 
    + Store these buntch of bytes with a unique key (also known as URL)
    + High durability and scalability 
    + its not a file systems(each object as a url)
    + Encrypted server side & data is encrypted during transit 
    + Block storage 
        * Physically addressable storage accesed from compute i.e persistant disks
    + object storage 
        * Http based lookup of the objects
    + Choosing among cloud storage classes 
        * Multi-regional & regional are high performance object storage
        * Nearline & coldline are backup and archieve
        
        * Multi-regional
            - Most frequently accessed 
            - 99.95%   
            - website content
        * Regional
            - 99.90% 
            - data close to compute engines 
        * Nearline 
            - 99.00%
            - Per giga 
            - infrequently accessed data 
            - once a month or less 
        * Coldline 
            - 99.00%
            - Once a year 
            - higher per operation cost
- gsutil and Online and offline data transfer 
    + import and export tables from cloud storage 
            


- Structured data 
    + SQL 
    
        * OLTP - ACID complance & transactional properties 
            - CLOUD SQL(Database Service) - Under 30 TB and regional payloads
                    * 64 core processes 
                    * 500gb to 30TB
                    * upto 416gb of RAM 
                    * Automatic backups(replication & point-in-time recovery)
                    * Firewalls and authorized networks 
                    * Only synchronizes with in a region
                    * Read replicas are seperate instances and its eventual reads 
                    * The stand by can also be used as a read replica
            - CLOUD SPANNER - Relational data-large payloads 
                    * a global  horizontally scalable 
                    * Strong consistency and not reading stale data
                    * stronger than eventual consistancy 
                    * Data is divided into splits 
                    * hash the key and use the hash values to generate the key 
                    * swap order of columns in primary key 
                    * use UUID to generate random primary keys 
        * OLAP - Analytical processing 
            - Big Query 
                    * Serverless 
                    * Autoscaling 
                    * Automatic high availability 
                    * scales to petabytes 
                    * No-ops or No-indices 
                    * No Acid or transaction support 
                    * Weak schema enforcement 
                    * saves data in Datasets and with in Datasets there are tables and views that can be created
                    * Specify tables and views in a dataset 
                    * each dataset can contain multiple tables 
                    * 

    + NOSQL
            - Bigtable & Firestore
            - fully managed wide-column database service 
            - sparsly populated rows 
            - Single lookup key 
            - its like a single key persistant hash 
            - Data encryption in-flight and rest
            - 
- Google Big data
    + Cloud data proc is a managed hadoop cluster
    + Cloud data flow offers managed Data pipelines, General purpose ETL tool 
    + BigQuery is a fully managed data warehouse








## LAB 1 


- START UP SCRIPT
    ``` bash
    apt-get update
    apt-get install apache2 php php-mysql -y
    service apache2 restart
    ```
    - 34.72.127.130 
    - 34.69.171.230 db 
    - gsutil acl ch -u john.doe@example.com:WRITE gs://example-bucket
    - gsutil acl ch -u allUsers:R gs://$DEVSHELL_PROJECT_ID/my-excellent-blog.png
- Learning
    + bucket acl 
    + gsutil ch -u allUsers:R
    + add vm ip with port number 32 to the database  



