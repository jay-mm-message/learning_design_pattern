

if [ -e "info.log" ]; then
  rm info.log
fi

javac *.java
java DogSellingStore

./generate.sh
./clean.sh
