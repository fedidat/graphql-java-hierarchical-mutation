package com.baeldung.graphql.schema;

import com.baeldung.graphql.mutation.RootMutation;
import graphql.annotations.GraphQLAnnotations;
import graphql.schema.GraphQLSchema;

import static graphql.schema.GraphQLSchema.newSchema;

import com.baeldung.graphql.mutation.UserMutation;
import com.baeldung.graphql.query.UserQuery;

public class UserSchema {

    private final GraphQLSchema schema;

    public UserSchema() throws IllegalAccessException, NoSuchMethodException, InstantiationException {
        schema = newSchema().query(GraphQLAnnotations.object(UserQuery.class))
            .mutation(GraphQLAnnotations.object(RootMutation.class))
            .build();
    }

    public GraphQLSchema getSchema() {
        return schema;
    }
}
