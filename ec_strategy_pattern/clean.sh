
directory=$(pwd)

files_name=$(find "$directory" -type f -name "*.class")

if [ -n "$files_name" ]; then
    rm $files_name
    echo "rm $files_name" 2>&1 >> log.txt
fi

