package clojure;

import clojure.lang.*;

public final class core_interleave extends clojure.lang.RestFn {
 static {
 }
 public core_interleave() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object c11, java.lang.Object c22, java.lang.Object colls3) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_interleave_fn__4556(c11, colls3, c22)));
 }
 public java.lang.Object invoke(java.lang.Object c11, java.lang.Object c22) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_interleave_fn__4553(c11, c22)));
 }
 public java.lang.Object invoke(java.lang.Object c11) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_interleave_fn__4551(c11)));
 }
 public java.lang.Object invoke() {
  return clojure.lang.PersistentList.EMPTY;
 }
 public int getRequiredArity() {
  return 2;
 }
}
