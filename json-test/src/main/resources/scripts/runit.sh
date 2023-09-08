#!/usr/bin/env bash

PWD=$(pwd)
PROJECT_ROOT="json-test"
JARFILE="JsonTestProject-1.0-SNAPSHOT.jar"

if [[ $(basename ${PWD}) != "${PROJECT_ROOT}" ]]; then
    RC=1
    echo "Exiting. Run script only from project-root: ${PROJECT_ROOT}"
else
    echo "Running in ${PROJECT_ROOT}..."
fi

echo "CWD to artifact path ./target..."
cd target 

EXTRACT="false"

if [[ ! -d config ]]; then
    EXTRACT="true"
fi

if [[ ! -d json ]]; then
    EXTRACT="true"
fi

if [[ "$EXTRACT" == "true" ]]; then 
  echo "Extracting configs and data..."
  unzip *.zip
else
  echo "skipping unzip..."
fi

echo
echo "checking Java..."
java -version
echo

echo "Running uber-JAR: ${JARFILE}"
java -jar "${JARFILE}"


