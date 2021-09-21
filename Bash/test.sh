#!/usr/bin/env bash

file=$1

api() {
    access_token=$1
    # echo $access_token
    
    curl --location --request GET "https://api.weixin.qq.com/wxa/getwxasearchstatus?access_token=${access_token}" \
    --header 'Content-Type: application/json' \
    --data-raw ''
    echo ''
    echo ''
}

# cat ./access_token.txt| api 123|bash
index=0
for line in $(cat $file); do
    index=$[index+1]
    echo "$index: $line"
    api $line
done

# ./test.sh access_token.txt