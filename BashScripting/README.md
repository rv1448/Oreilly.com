## EnvironmentFiles
- 



## Variables
- Use export to have variables available in sub processes
## Variables and Subshell
- export will make the variables available downword
- declare variables in /etc/profile to have them avaiable after start of the shell
- use . or source to import a file into a shell and not the child shell
- '' are strong quotes, used to skip executing the content
## Parameters
- $1 and $2 is the parameters passed to the script 
- $0 is the script name with complete path name
- $@ refers to all arguments
- $# referes to number of arguments being passed


## Here Document
- is to feed command list into interactive program
- use in scripts instead of echo
* Cut the Field
    - cut -f 1 -d : 
    - curt by field and field number and delimiter


## Arrays
	- declare -a to see all the arrays 
	- echo $BASH_VERSINFO[0] will not print the first element
	- echo ${BASH_VERSINFO[0]} everything in the flower bracket is seen as an variable
	

## ReadOnly
	- readonly env="prod"
