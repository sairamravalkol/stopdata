package doj.ca.gov.excelparser;


import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

public class DbConnection {
	
	
	static String server_ip = "127.0.0.1";
	static String keyspace = "stop_data";

	//Application connection objects
	static Cluster cluster = null;
	static Session session = null;

	public static Session openConnection() {
	if(cluster!=null) return null;
	cluster = Cluster.builder()
	.addContactPoints(server_ip)
	.build();
	 
	final Metadata metadata = cluster.getMetadata();
	String msg = String.format("Connected to cluster: %s", metadata.getClusterName());
	System.out.println(msg);
	 
	System.out.println("List of hosts");
	for (final Host host : metadata.getAllHosts()){
	msg = String.format("Datacenter: %s; Host: %s; Rack: %s",
	host.getDatacenter(),
	host.getAddress(),
	host.getRack());
	System.out.println(msg);
	}
	session = cluster.connect(keyspace);
	return session;
	}
	
	
}


