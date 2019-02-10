package jupiterpi.chatsubstandard.model.dynamodb;

import java.util.List;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;


public class DynamoDBBase<T> {
	
	final protected AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
	final protected DynamoDBMapper mapper = new DynamoDBMapper(client);
	protected DynamoDBQueryExpression<T> query = new DynamoDBQueryExpression<T>();
	
	protected T findOne(T key, Class<T> cl) {
		return mapper.query(cl, query.withHashKeyValues(key)).get(0);
	}
	protected List<T> findAll(Class<T> cl) {
		return mapper.query(cl, query);
	}
	
}
