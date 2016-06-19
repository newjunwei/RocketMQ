echo "git pull"
git pull
rm -rf target
rm -f devenv
if [ -z "$JAVA_HOME" ]; then
  JAVA_HOME=/opt/taobao/java
fi
export PATH=/opt/taobao/mvn/bin:$JAVA_HOME/bin:$PATH
echo "start mvn ..."
mvn -Dmaven.test.skip=true clean package install assembly:assembly -U
echo "end mvn ..."
ln -s target/alibaba-rocketmq.dir/alibaba-rocketmq devenv
