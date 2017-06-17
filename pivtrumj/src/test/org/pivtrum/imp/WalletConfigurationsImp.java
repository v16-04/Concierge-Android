package org.pivtrum.imp;

import org.bitcoinj.core.Context;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.TestNet3Params;

import global.WalletConfiguration;

/**
 * Created by furszy on 6/16/17.
 */

public class WalletConfigurationsImp implements WalletConfiguration {

    public static NetworkParameters networkParameters = TestNet3Params.get();
    public static Context context = new Context(networkParameters);

    @Override
    public String getMnemonicFilename() {
        return null;
    }

    @Override
    public String getWalletProtobufFilename() {
        return "protobuf_filename.dat";
    }

    @Override
    public NetworkParameters getNetworkParams() {
        return networkParameters;
    }

    @Override
    public String getKeyBackupProtobuf() {
        return "key_backup_proto.dat";
    }

    @Override
    public long getWalletAutosaveDelayMs() {
        return  5000;
    }

    @Override
    public Context getWalletContext() {
        return context;
    }
}
