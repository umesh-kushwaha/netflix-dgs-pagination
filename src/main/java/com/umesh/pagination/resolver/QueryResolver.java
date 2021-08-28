package com.umesh.pagination.resolver;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.umesh.pagination.generated.types.Video;
import com.umesh.pagination.util.VideoHelper;
import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;

/**
 * @author ukushwaha
 */
@DgsComponent
public class QueryResolver {



    @DgsData(parentType = "Query", field = "vidoes")
    public Connection<Video> vidoes(DataFetchingEnvironment env, @InputArgument("first") int first, @InputArgument("after") String after) {


        return new SimpleListConnection<>(VideoHelper.getVideoList()).get(env);
    }
}
