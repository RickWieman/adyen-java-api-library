/**
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

/**
 * GetAccountHolderRequest
 */
public class GetAccountHolderRequest {
    @SerializedName("accountHolderCode")
    private String accountHolderCode = null;

    @SerializedName("accountCode")
    private String accountCode = null;

    public GetAccountHolderRequest accountHolderCode(String accountHolderCode) {
        this.accountHolderCode = accountHolderCode;
        return this;
    }

    /**
     * code of the account holder, whose information has to be retrieved
     *
     * @return accountHolderCode
     **/
    public String getAccountHolderCode() {
        return accountHolderCode;
    }

    public void setAccountHolderCode(String accountHolderCode) {
        this.accountHolderCode = accountHolderCode;
    }

    public GetAccountHolderRequest accountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }

    /**
     * code of the account, whose information has to be retrieved
     *
     * @return accountCode
     **/
    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAccountHolderRequest getAccountHolderRequest = (GetAccountHolderRequest) o;
        return Objects.equals(this.accountHolderCode, getAccountHolderRequest.accountHolderCode) && Objects.equals(this.accountCode, getAccountHolderRequest.accountCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountHolderCode, accountCode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccountHolderRequest {\n");

        sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
        sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
