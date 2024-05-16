package Principal;

import java.util.*;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class CRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jedis pool = new Jedis("localhost",6379);
		
		try {
			System.out.println(pool.get("key"));
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			pool.close();
		}

		

	}

}
