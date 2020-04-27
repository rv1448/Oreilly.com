



## IMMUTABILITY

> employeer_1 = new Employee("sal",2000) 
> employeer_1.change_salary(1000)

> employeer_1 = new Employee(employeer_1.name, 1000)

## First Class Functions

## DataFrame Operations

> df.values
returns a numpy array  - ndarray
> df.to_numpy()
return a numpy array - ndarray
> df.info()
> df.describe()
> 

## Understanding Data Types

> df.info()
prints not null population and counts of the fields
> df.`[columnname]` or df.`columnname`
returns series with index 
> df.loc[0:2,['state','positiveScore']]
> df.iloc[0:2,0:2]
i is used to refer column name with indexes. 


## COLUMN RENAME 

> df.rename(columns=dict_old_new)


## ESSENTIAL DATAFRAME OPERATIONS

#### SELECTING MULTIPLE COLUMNS IN DATAFRAME
> movies['color'].value_counts() 
Color              4693
Black and White     204
Name: color, dtype: int64

#### SELECTING COLUMNS WITH METHODS
`select_dtypes` and `filter`
> df.select_dtype(include=np.int)
> df.filter(like='cat')













