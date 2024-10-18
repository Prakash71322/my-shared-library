def mvn_win_build() {
    def mvnCommand = 'mvn --version'
    def result = bat (returnStdout: true, script: mvnCommand, label: "" )
    echo result
}