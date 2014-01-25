package clojure.core;

import clojure.lang.*;

public final class ArrayChunk extends java.lang.Object implements clojure.lang.Indexed, clojure.lang.IChunk, clojure.lang.IType {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "-");
 }
 public  final Object am;
 public  final Object arr;
 public  final int off;
 public  final int end;
 public ArrayChunk(final Object am, final Object arr, final int off, final int end) {
  super();
  this.am = am;
  this.arr = arr;
  this.off = off;
  this.end = end;
 }
 public static clojure.lang.IPersistentVector getBasis() {
  return RT.vector(((clojure.lang.IObj)Symbol.intern(null, "am")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "clojure.core.ArrayManager"))), Symbol.intern(null, "arr"), ((clojure.lang.IObj)Symbol.intern(null, "off")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "int"))), ((clojure.lang.IObj)Symbol.intern(null, "end")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "int"))));
 }
 public int count()  {
  return RT.intCast(clojure.lang.Numbers.minus((long)end, (long)off));
 }
 public java.lang.Object nth(int i1)  {
  return ((java.lang.Object)((clojure.core.ArrayManager)this.am).aget(((java.lang.Object)this.arr), (int)RT.intCast(clojure.lang.Numbers.add((long)off, (long)i1))));
 }
 public java.lang.Object reduce(clojure.lang.IFn f1, java.lang.Object init2)  {
  {
   Object ret3 = init2;
   long i4 = clojure.lang.RT.longCast((int)off);
   while(true) {
    if (clojure.lang.Numbers.lt((long)i4, (long)end)) {
     java.lang.Object ret3___aux = ((IFn)f1).invoke(ret3, ((java.lang.Object)((clojure.core.ArrayManager)this.am).aget(((java.lang.Object)this.arr), (int)RT.intCast(i4))));
     long i4___aux = clojure.lang.Numbers.inc((long)i4);
     ret3 = ret3___aux;
     i4 = i4___aux;
     continue;
    } else {
     return ret3;
    }
   }
  }
 }
 public clojure.lang.IChunk dropFirst()  {
  if (clojure.lang.Util.equiv((long)off, (long)end)) {
   Util.trow((Throwable)new java.lang.IllegalStateException((java.lang.String)((java.lang.String)"dropFirst of empty chunk")));
   return (clojure.lang.IChunk)null;
  } else {
   return (clojure.lang.IChunk)new clojure.core.ArrayChunk(((java.lang.Object)this.am), ((java.lang.Object)this.arr), (int)RT.intCast(clojure.lang.Numbers.inc((long)off)), (int)end);
  }
 }
 public java.lang.Object nth(int p0, java.lang.Object p1)  {
  throw new RuntimeException("Reify non implemented method");
 }
}
