remote="$1"
url="$2"

BRANCH=$(git rev-parse --abbrev-ref HEAD)
path=$(pwd)

readYaml="$(ruby $path/hooks/read-yaml.rb)"

remote_url="$(echo $readYaml | cut -d' ' -f1)"

branch="$(echo $readYaml | cut -d' ' -f2)"
#remote_name="$(echo $readYaml | cut -d' ' -f4)"

token="$(echo $readYaml | cut -d' ' -f3)"

#echo "aaaa=$token"

#if [ -z "$remote_name" ]:
#then 
#	remote_name="github"
#fi 

#check="$(git remote get-url $remote_name)"
#if [ "$check" ]:; then echo "$remote Pushing....."; else git remote add $remote_name $remote_url && echo "Add first $remote_name URL"; fi

if [ $remote = "origin" ]
then
   git push https://$token@github.com/$remote_url $BRANCH:$branch
fi

exit $?
