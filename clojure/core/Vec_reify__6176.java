package clojure.core;

import clojure.lang.*;

public final class Vec_reify__6176 extends java.lang.Object implements java.util.ListIterator, clojure.lang.IObj {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "dec");
 }
 final clojure.lang.IPersistentMap __meta;
 Object i2;
 Object this0;
 int cnt;
 public Vec_reify__6176(final clojure.lang.IPersistentMap __meta, final Object i2, final Object this0, final int cnt) {
  super();
  this.__meta = __meta;
  this.i2 = i2;
  this.this0 = this0;
  this.cnt = cnt;
 }
 public Vec_reify__6176(java.lang.Object __r3912, java.lang.Object __r3913, int __r3914) {
  this(null, __r3912, __r3913, __r3914);
 }
 public clojure.lang.IPersistentMap meta() { return this.__meta; }
 public clojure.lang.IObj withMeta(clojure.lang.IPersistentMap __meta) {
  return new Vec_reify__6176(__meta, (Object)i2, (Object)this0, (int)cnt);
 }
 public void set(java.lang.Object e1)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
 }
 public void remove()  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
 }
 public void add(java.lang.Object e1)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
 }
 public int previousIndex()  {
  return RT.intCast(clojure.lang.Numbers.dec((long)((java.util.concurrent.atomic.AtomicInteger)this.i2).get()));
 }
 public java.lang.Object previous()  {
  return ((java.lang.Object)((clojure.lang.Indexed)this.this0).nth((int)((java.util.concurrent.atomic.AtomicInteger)this.i2).decrementAndGet()));
 }
 public int nextIndex()  {
  return ((java.util.concurrent.atomic.AtomicInteger)this.i2).get();
 }
 public java.lang.Object next()  {
  return ((java.lang.Object)((clojure.lang.Indexed)this.this0).nth((int)RT.intCast(clojure.lang.Numbers.dec((long)((java.util.concurrent.atomic.AtomicInteger)this.i2).incrementAndGet()))));
 }
 public boolean hasPrevious()  {
  return clojure.lang.Numbers.isPos(((java.lang.Object)this.i2));
 }
 public boolean hasNext()  {
  return clojure.lang.Numbers.lt((long)((java.util.concurrent.atomic.AtomicInteger)this.i2).get(), (long)cnt);
 }
}
