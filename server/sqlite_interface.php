<?php
$db = new SQLite3('bookmart.sqlite');

$req = $_GET['req'];
if ($req == 0) { // auth:username,pw:password
	$user = $_GET['u'];
	$pw = $_GET['p'];

	$statement = $db->prepare('SELECT * FROM user WHERE email = :email AND password = :pw;');
	$statement->bindValue(':email', $user);
	$statement->bindValue(':pw', $pw);

	$result = $statement->execute();

	echo $result;
}

else if ($req == 1 || $req == 2) { // from:table,get:json
	$table = $_GET['tbl'];
	$json = $_GET['json'];

	
}
?>
