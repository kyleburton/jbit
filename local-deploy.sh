#mvn -DaltDeploymentRepository=snapshot-repo::default::file:../kyleburton-mvn-repo/snapshots clean deploy
mvn -DaltDeploymentRepository=release-repo::default::file:../kyleburton-mvn-repo/releases clean deploy
