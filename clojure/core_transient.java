package clojure;

import clojure.lang.*;

public final class core_transient extends clojure.lang.AFunction {
 static {
 }
 public core_transient() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((clojure.lang.ITransientCollection)((clojure.lang.IEditableCollection)coll1).asTransient());
 }
}
