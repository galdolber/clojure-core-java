package clojure.core;

import clojure.lang.*;

public final class Vec_reify__6174 extends java.lang.Object implements java.util.Iterator, clojure.lang.IObj {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "dec");
 }
 final clojure.lang.IPersistentMap __meta;
 Object i1;
 Object this0;
 int cnt;
 public Vec_reify__6174(final clojure.lang.IPersistentMap __meta, final Object i1, final Object this0, final int cnt) {
  super();
  this.__meta = __meta;
  this.i1 = i1;
  this.this0 = this0;
  this.cnt = cnt;
 }
 public Vec_reify__6174(java.lang.Object __r3909, java.lang.Object __r3910, int __r3911) {
  this(null, __r3909, __r3910, __r3911);
 }
 public clojure.lang.IPersistentMap meta() { return this.__meta; }
 public clojure.lang.IObj withMeta(clojure.lang.IPersistentMap __meta) {
  return new Vec_reify__6174(__meta, (Object)i1, (Object)this0, (int)cnt);
 }
 public void remove()  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
 }
 public java.lang.Object next()  {
  return ((java.lang.Object)((clojure.lang.Indexed)this.this0).nth((int)RT.intCast(clojure.lang.Numbers.dec((long)((java.util.concurrent.atomic.AtomicInteger)this.i1).incrementAndGet()))));
 }
 public boolean hasNext()  {
  return clojure.lang.Numbers.lt((long)((java.util.concurrent.atomic.AtomicInteger)this.i1).get(), (long)cnt);
 }
}
