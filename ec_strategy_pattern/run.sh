

if [ -e "log.txt" ]; then
  rm log.txt
fi

javac *.java
java DogSellingStore

./generate.sh
./clean.sh
