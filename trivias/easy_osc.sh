#! /bin/bash

command="osc list $1"
echo "Executing command: $command"
package_list=$($command)

for package in $package_list 
do
    echo "Copying package $package from $1 to $2"
    osc copypac $1 $package $2
done


