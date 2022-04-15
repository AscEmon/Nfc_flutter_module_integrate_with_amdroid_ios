

import 'package:nfc_module/model/write_record.dart';
import 'package:nfc_module/repository/repository.dart';

class RepositoryImplDemo implements Repository {
  final SubscriptionManager _subscriptionManager = SubscriptionManager();

  @override
  Stream<Iterable<WriteRecord>> subscribeWriteRecordList() {
    return _subscriptionManager.createStream(() {
      throw UnimplementedError();
    });
  }

  @override
  Future<WriteRecord> createOrUpdateWriteRecord(WriteRecord record) {
    throw UnimplementedError();
  }

  @override
  Future<void> deleteWriteRecord(WriteRecord record) {
    throw UnimplementedError();
  }
}
