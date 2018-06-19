package com.baeldung.graphql.mutation;

import com.baeldung.graphql.utils.SchemaUtils;
import graphql.annotations.GraphQLField;
import graphql.annotations.GraphQLName;

@GraphQLName(SchemaUtils.MUTATION)
public class MutationRoot {
    static UserMutation userMutation = new UserMutation();

    @GraphQLField
    public static UserMutation user() {
        return userMutation;
    }
}
