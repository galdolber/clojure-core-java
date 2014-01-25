package clojure.core;

import clojure.lang.*;

public final class Vec extends java.lang.Object implements clojure.lang.Reversible, clojure.lang.IPersistentCollection, clojure.lang.Indexed, clojure.lang.Counted, java.lang.Comparable, clojure.lang.Sequential, java.lang.Iterable, clojure.lang.Associative, java.util.List, java.util.Collection, clojure.lang.Seqable, clojure.core.IVecImpl, clojure.lang.IObj, clojure.lang.IPersistentVector, clojure.lang.ILookup, clojure.lang.IFn, clojure.lang.IPersistentStack, clojure.lang.IMeta, clojure.lang.IType {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final java.lang.Object const__18;
 public static final java.lang.Object const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Keyword const__23;
 public static final java.lang.Object const__24;
 public static final java.lang.Object const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final java.lang.Object const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Var const__31;
 public static final java.lang.Object const__32;
 public static final clojure.lang.Keyword const__33;
 public static final java.lang.Object const__34;
 public static final clojure.lang.Keyword const__35;
 public static final java.lang.Object const__36;
 public static final clojure.lang.IPersistentMap const__37;
 public static final clojure.lang.Var const__38;
 public static final clojure.lang.Var const__39;
 public static final java.lang.Object const__40;
 public static final clojure.lang.IPersistentMap const__41;
 public static final clojure.lang.Var const__42;
 public static final clojure.lang.Var const__43;
 public static final clojure.lang.Var const__44;
 public static final clojure.lang.Var const__45;
 public static final clojure.lang.Var const__46;
 public static final clojure.lang.Var const__47;
 public static final java.lang.Object const__48;
 public static final clojure.lang.Var const__49;
 public static final clojure.lang.Var const__50;
 public static final clojure.lang.Var const__51;
 public static final clojure.lang.Var const__52;
 public static final clojure.lang.Var const__53;
 public static final clojure.lang.Var const__54;
 public static final java.lang.Object const__55;
 public static final clojure.lang.Var const__56;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__6 = (java.lang.Object)32L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "bit-shift-right");
  const__10 = (java.lang.Object)5L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "bit-shift-left");
  const__12 = (java.lang.Object)1L;
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "object-array");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "aset");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "EMPTY-NODE");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__18 = (java.lang.Object)clojure.lang.IPersistentVector.class;
  const__19 = (java.lang.Object)java.util.RandomAccess.class;
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__23 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__24 = (java.lang.Object)clojure.lang.Sequential.class;
  const__25 = (java.lang.Object)java.util.List.class;
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "bit-and");
  const__28 = (java.lang.Object)31L;
  const__29 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "cast");
  const__32 = (java.lang.Object)(-1L);
  const__33 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__34 = (java.lang.Object)370;
  const__35 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__36 = (java.lang.Object)7;
  const__37 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 7, Keyword.intern(null, "line"), 370);
  const__38 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__39 = (clojure.lang.Var)RT.var("clojure.core", "==");
  const__40 = (java.lang.Object)412;
  const__41 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 7, Keyword.intern(null, "line"), 412);
  const__42 = (clojure.lang.Var)RT.var("clojure.core", "subvec");
  const__43 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
  const__44 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__45 = (clojure.lang.Var)RT.var("clojure.core", "every?");
  const__46 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__47 = (clojure.lang.Var)RT.var("clojure.core", "into-array");
  const__48 = (java.lang.Object)java.lang.Object.class;
  const__49 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__50 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__51 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-add-int");
  const__52 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-multiply-int");
  const__53 = (clojure.lang.Var)RT.var("clojure.core", "aget");
  const__54 = (clojure.lang.Var)RT.var("clojure.core", "aclone");
  const__55 = (java.lang.Object)2L;
  const__56 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
 }
 public  final Object am;
 public  final int cnt;
 public  final int shift;
 public  final Object root;
 public  final Object tail;
 public  final Object _meta;
 public Vec(final Object am, final int cnt, final int shift, final Object root, final Object tail, final Object _meta) {
  super();
  this.am = am;
  this.cnt = cnt;
  this.shift = shift;
  this.root = root;
  this.tail = tail;
  this._meta = _meta;
 }
 public static clojure.lang.IPersistentVector getBasis() {
  return RT.vector(((clojure.lang.IObj)Symbol.intern(null, "am")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "clojure.core.ArrayManager"))), ((clojure.lang.IObj)Symbol.intern(null, "cnt")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "int"))), ((clojure.lang.IObj)Symbol.intern(null, "shift")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "int"))), ((clojure.lang.IObj)Symbol.intern(null, "root")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "clojure.core.VecNode"))), Symbol.intern(null, "tail"), Symbol.intern(null, "_meta"));
 }
 public clojure.lang.IPersistentMap meta()  {
  return (clojure.lang.IPersistentMap)this._meta;
 }
 public clojure.lang.IPersistentStack pop()  {
  if (clojure.lang.Numbers.isZero((long)cnt)) {
   Util.trow((Throwable)new java.lang.IllegalStateException((java.lang.String)((java.lang.String)"Can't pop empty vector")));
   return (clojure.lang.IPersistentStack)null;
  } else {
   if (clojure.lang.Util.equiv((long)1L, (long)cnt)) {
    return (clojure.lang.IPersistentStack)new clojure.core.Vec(((java.lang.Object)this.am), (int)RT.intCast(0L), (int)RT.intCast(5L), ((java.lang.Object)const__16.getRawRoot()), ((java.lang.Object)((java.lang.Object)((clojure.core.ArrayManager)this.am).array((int)RT.intCast(0L)))), ((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this)));
   } else {
    if (clojure.lang.Numbers.gt((long)clojure.lang.Numbers.minus((long)cnt, (long)((clojure.core.IVecImpl)this).tailoff()), (long)1L)) {
     {
      Object new_tail1 = ((java.lang.Object)((clojure.core.ArrayManager)this.am).array((int)RT.intCast(clojure.lang.Numbers.dec((long)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.tail))))));
      java.lang.System.arraycopy(((java.lang.Object)this.tail), (int)RT.intCast(0L), ((java.lang.Object)new_tail1), (int)RT.intCast(0L), (int)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)new_tail1)));
      return (clojure.lang.IPersistentStack)new clojure.core.Vec(((java.lang.Object)this.am), (int)RT.intCast(clojure.lang.Numbers.dec((long)cnt)), (int)shift, ((java.lang.Object)this.root), ((java.lang.Object)new_tail1), ((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this)));
     }
    } else {
     Object __r3919 = const__23;
     if (__r3919 != null && !(__r3919 == Boolean.FALSE)) {
      {
       Object new_tail2 = ((java.lang.Object)((clojure.core.IVecImpl)this).arrayFor((int)RT.intCast(clojure.lang.Numbers.minus((long)cnt, (long)2L))));
       Object new_root3 = ((java.lang.Object)((clojure.core.IVecImpl)this).popTail((int)shift, ((java.lang.Object)this.root)));
       if (clojure.lang.Util.identical(((java.lang.Object)new_root3), ((java.lang.Object)null))) {
        return (clojure.lang.IPersistentStack)new clojure.core.Vec(((java.lang.Object)this.am), (int)RT.intCast(clojure.lang.Numbers.dec((long)cnt)), (int)shift, ((java.lang.Object)const__16.getRawRoot()), ((java.lang.Object)new_tail2), ((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this)));
       } else {
        Object __r3922 = null;
        boolean and__3966__auto__4 = clojure.lang.Numbers.gt((long)shift, (long)5L);
        Object __r3923;
        if (and__3966__auto__4) {
         __r3923 = clojure.lang.Util.identical(((java.lang.Object)((java.lang.Object)clojure.lang.RT.aget((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)new_root3).arr)), (int)clojure.lang.RT.intCast((long)1L)))), ((java.lang.Object)null));
        } else {
         __r3923 = and__3966__auto__4;
        }
        if ((java.lang.Boolean)__r3923) {
         return (clojure.lang.IPersistentStack)new clojure.core.Vec(((java.lang.Object)this.am), (int)RT.intCast(clojure.lang.Numbers.dec((long)cnt)), (int)RT.intCast(clojure.lang.Numbers.minus((long)shift, (long)5L)), ((java.lang.Object)((java.lang.Object)clojure.lang.RT.aget((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)new_root3).arr)), (int)clojure.lang.RT.intCast((long)0L)))), ((java.lang.Object)new_tail2), ((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this)));
        } else {
         Object __r3925 = const__23;
         if (__r3925 != null && !(__r3925 == Boolean.FALSE)) {
          return (clojure.lang.IPersistentStack)new clojure.core.Vec(((java.lang.Object)this.am), (int)RT.intCast(clojure.lang.Numbers.dec((long)cnt)), (int)shift, ((java.lang.Object)new_root3), ((java.lang.Object)new_tail2), ((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this)));
         } else {
          return (clojure.lang.IPersistentStack)null;
         }
        }
       }
      }
     } else {
      return (clojure.lang.IPersistentStack)null;
     }
    }
   }
  }
 }
 public java.lang.Object peek()  {
  if (clojure.lang.Numbers.gt((long)cnt, (long)clojure.lang.RT.intCast((long)0L))) {
   return ((java.lang.Object)((clojure.lang.Indexed)this).nth((int)RT.intCast(clojure.lang.Numbers.dec((long)cnt))));
  } else {
   return null;
  }
 }
 public java.lang.Object invoke(java.lang.Object k1)  {
  if (clojure.lang.Util.isInteger(((java.lang.Object)k1))) {
   {
    int i2 = clojure.lang.RT.intCast(((java.lang.Object)k1));
    Object __r3929 = null;
    boolean and__3966__auto__3 = clojure.lang.Numbers.gte((long)i2, (long)0L);
    Object __r3930;
    if (and__3966__auto__3) {
     __r3930 = clojure.lang.Numbers.lt((long)i2, (long)cnt);
    } else {
     __r3930 = and__3966__auto__3;
    }
    if ((java.lang.Boolean)__r3930) {
     return ((java.lang.Object)((clojure.lang.Indexed)this).nth((int)i2));
    } else {
     Util.trow((Throwable)new java.lang.IndexOutOfBoundsException());
     return null;
    }
   }
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)"Key must be integer")));
   return null;
  }
 }
 public java.lang.Object valAt(java.lang.Object k1)  {
  return ((java.lang.Object)((clojure.lang.ILookup)this).valAt(((java.lang.Object)k1), ((java.lang.Object)null)));
 }
 public java.lang.Object valAt(java.lang.Object k1, java.lang.Object not_found2)  {
  if (clojure.lang.Util.isInteger(((java.lang.Object)k1))) {
   {
    int i3 = clojure.lang.RT.intCast(((java.lang.Object)k1));
    Object __r3933 = null;
    boolean and__3966__auto__4 = clojure.lang.Numbers.gte((long)i3, (long)0L);
    Object __r3934;
    if (and__3966__auto__4) {
     __r3934 = clojure.lang.Numbers.lt((long)i3, (long)cnt);
    } else {
     __r3934 = and__3966__auto__4;
    }
    if ((java.lang.Boolean)__r3934) {
     return ((java.lang.Object)((clojure.lang.Indexed)this).nth((int)i3));
    } else {
     return not_found2;
    }
   }
  } else {
   return not_found2;
  }
 }
 public clojure.lang.IPersistentVector assocN(int i1, java.lang.Object val2)  {
  Object __r3936 = null;
  boolean and__3966__auto__3 = clojure.lang.Numbers.lte((long)clojure.lang.RT.intCast((long)0L), (long)i1);
  Object __r3937;
  if (and__3966__auto__3) {
   __r3937 = clojure.lang.Numbers.lt((long)i1, (long)cnt);
  } else {
   __r3937 = and__3966__auto__3;
  }
  if ((java.lang.Boolean)__r3937) {
   if (clojure.lang.Numbers.gte((long)i1, (long)((clojure.core.IVecImpl)this).tailoff())) {
    {
     Object new_tail4 = ((java.lang.Object)((clojure.core.ArrayManager)this.am).array((int)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.tail))));
     java.lang.System.arraycopy(((java.lang.Object)this.tail), (int)RT.intCast(0L), ((java.lang.Object)new_tail4), (int)RT.intCast(0L), (int)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.tail)));
     ((clojure.core.ArrayManager)this.am).aset(((java.lang.Object)new_tail4), (int)RT.intCast(clojure.lang.Numbers.and((long)i1, (long)clojure.lang.RT.intCast((long)31L))), ((java.lang.Object)val2));
     return (clojure.lang.IPersistentVector)new clojure.core.Vec(((java.lang.Object)this.am), (int)cnt, (int)shift, ((java.lang.Object)this.root), ((java.lang.Object)new_tail4), ((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this)));
    }
   } else {
    return (clojure.lang.IPersistentVector)new clojure.core.Vec(((java.lang.Object)this.am), (int)cnt, (int)shift, ((java.lang.Object)((java.lang.Object)((clojure.core.IVecImpl)this).doAssoc((int)shift, ((java.lang.Object)this.root), (int)i1, ((java.lang.Object)val2)))), ((java.lang.Object)this.tail), ((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this)));
   }
  } else {
   if (clojure.lang.Util.equiv((long)i1, (long)cnt)) {
    return (clojure.lang.IPersistentVector)((clojure.lang.IPersistentVector)((clojure.lang.IPersistentVector)this).cons(((java.lang.Object)val2)));
   } else {
    Object __r3941 = const__23;
    if (__r3941 != null && !(__r3941 == Boolean.FALSE)) {
     Util.trow((Throwable)new java.lang.IndexOutOfBoundsException());
     return (clojure.lang.IPersistentVector)null;
    } else {
     return (clojure.lang.IPersistentVector)null;
    }
   }
  }
 }
 public clojure.lang.IObj withMeta(clojure.lang.IPersistentMap m1)  {
  return (clojure.lang.IObj)new clojure.core.Vec(((java.lang.Object)this.am), (int)cnt, (int)shift, ((java.lang.Object)this.root), ((java.lang.Object)this.tail), ((java.lang.Object)m1));
 }
 public java.lang.Object doAssoc(int level1, java.lang.Object node2, int i3, java.lang.Object val4)  {
  {
   Object node5 = node2;
   if (clojure.lang.Numbers.isZero((long)level1)) {
    {
     Object arr6 = ((java.lang.Object)((clojure.core.ArrayManager)this.am).aclone(((java.lang.Object)((java.lang.Object)((clojure.core.VecNode)node5).arr))));
     ((clojure.core.ArrayManager)this.am).aset(((java.lang.Object)arr6), (int)RT.intCast(clojure.lang.Numbers.and((long)i3, (long)clojure.lang.RT.intCast((long)31L))), ((java.lang.Object)val4));
     return new clojure.core.VecNode(((java.lang.Object)((java.lang.Object)((clojure.core.VecNode)node5).edit)), ((java.lang.Object)arr6));
    }
   } else {
    {
     Object arr7 = ((java.lang.Object[])clojure.lang.RT.aclone((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)node5).arr))));
     long subidx8 = clojure.lang.Numbers.and((long)clojure.lang.Numbers.shiftRight((long)i3, (long)level1), (long)clojure.lang.RT.intCast((long)31L));
     clojure.lang.RT.aset((java.lang.Object[])((java.lang.Object[])arr7), (int)clojure.lang.RT.intCast((long)subidx8), ((java.lang.Object)((java.lang.Object)((clojure.core.IVecImpl)this).doAssoc((int)RT.intCast(clojure.lang.Numbers.minus((long)level1, (long)clojure.lang.RT.intCast((long)5L))), ((java.lang.Object)((java.lang.Object)clojure.lang.RT.aget((java.lang.Object[])((java.lang.Object[])arr7), (int)clojure.lang.RT.intCast((long)subidx8)))), (int)i3, ((java.lang.Object)val4)))));
     return new clojure.core.VecNode(((java.lang.Object)((java.lang.Object)((clojure.core.VecNode)node5).edit)), ((java.lang.Object)arr7));
    }
   }
  }
 }
 public java.lang.Object newPath(java.lang.Object edit1, int level2, java.lang.Object node3)  {
  if (clojure.lang.Numbers.isZero((long)level2)) {
   return node3;
  } else {
   {
    Object ret4 = new clojure.core.VecNode(((java.lang.Object)edit1), ((java.lang.Object)((java.lang.Object[])clojure.lang.RT.object_array(((java.lang.Object)const__6)))));
    clojure.lang.RT.aset((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)ret4).arr)), (int)clojure.lang.RT.intCast((long)0L), ((java.lang.Object)((java.lang.Object)((clojure.core.IVecImpl)this).newPath(((java.lang.Object)edit1), (int)RT.intCast(clojure.lang.Numbers.minus((long)level2, (long)clojure.lang.RT.intCast((long)5L))), ((java.lang.Object)node3)))));
    return ret4;
   }
  }
 }
 public java.lang.Object popTail(int level1, java.lang.Object node2)  {
  {
   Object node3 = node2;
   long subidx4 = clojure.lang.Numbers.and((long)clojure.lang.Numbers.shiftRight((long)clojure.lang.Numbers.minus((long)cnt, (long)clojure.lang.RT.intCast((long)2L)), (long)level1), (long)clojure.lang.RT.intCast((long)31L));
   if (clojure.lang.Numbers.gt((long)level1, (long)5L)) {
    {
     Object new_child5 = ((java.lang.Object)((clojure.core.IVecImpl)this).popTail((int)RT.intCast(clojure.lang.Numbers.minus((long)level1, (long)5L)), ((java.lang.Object)((java.lang.Object)clojure.lang.RT.aget((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)node3).arr)), (int)clojure.lang.RT.intCast((long)subidx4))))));
     Object __r3946 = null;
     boolean and__3966__auto__6 = clojure.lang.Util.identical(((java.lang.Object)new_child5), ((java.lang.Object)null));
     Object __r3947;
     if (and__3966__auto__6) {
      __r3947 = clojure.lang.Numbers.isZero((long)subidx4);
     } else {
      __r3947 = and__3966__auto__6;
     }
     if ((java.lang.Boolean)__r3947) {
      return null;
     } else {
      {
       Object arr7 = ((java.lang.Object[])clojure.lang.RT.aclone((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)node3).arr))));
       clojure.lang.RT.aset((java.lang.Object[])((java.lang.Object[])arr7), (int)clojure.lang.RT.intCast((long)subidx4), ((java.lang.Object)new_child5));
       return new clojure.core.VecNode(((java.lang.Object)((java.lang.Object)((clojure.core.VecNode)this.root).edit)), ((java.lang.Object)arr7));
      }
     }
    }
   } else {
    if (clojure.lang.Numbers.isZero((long)subidx4)) {
     return null;
    } else {
     Object __r3950 = const__23;
     if (__r3950 != null && !(__r3950 == Boolean.FALSE)) {
      {
       Object arr8 = ((java.lang.Object[])clojure.lang.RT.aclone((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)node3).arr))));
       clojure.lang.RT.aset((java.lang.Object[])((java.lang.Object[])arr8), (int)clojure.lang.RT.intCast((long)subidx4), ((java.lang.Object)null));
       return new clojure.core.VecNode(((java.lang.Object)((java.lang.Object)((clojure.core.VecNode)this.root).edit)), ((java.lang.Object)arr8));
      }
     } else {
      return null;
     }
    }
   }
  }
 }
 public java.lang.Object pushTail(int level1, clojure.core.VecNode parent2, clojure.core.VecNode tailnode3)  {
  {
   long subidx4 = clojure.lang.Numbers.and((long)clojure.lang.Numbers.shiftRight((long)clojure.lang.Numbers.dec((long)cnt), (long)level1), (long)clojure.lang.RT.intCast((long)31L));
   Object parent5 = parent2;
   Object ret6 = new clojure.core.VecNode(((java.lang.Object)((java.lang.Object)((clojure.core.VecNode)parent5).edit)), ((java.lang.Object)((java.lang.Object[])clojure.lang.RT.aclone((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)parent5).arr))))));
   Object __r3951;
   if (clojure.lang.Util.equiv((long)level1, (long)clojure.lang.RT.intCast((long)5L))) {
    __r3951 = tailnode3;
   } else {
    Object __r3952 = null;
    {
     Object child7 = ((java.lang.Object)clojure.lang.RT.aget((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)parent5).arr)), (int)clojure.lang.RT.intCast((long)subidx4)));
     Object __r3953;
     Object __r3954 = child7;
     if (__r3954 != null && !(__r3954 == Boolean.FALSE)) {
      __r3953 = ((java.lang.Object)((clojure.core.IVecImpl)this).pushTail((int)RT.intCast(clojure.lang.Numbers.minus((long)level1, (long)clojure.lang.RT.intCast((long)5L))), (clojure.core.VecNode)((clojure.core.VecNode)child7), (clojure.core.VecNode)((clojure.core.VecNode)tailnode3)));
     } else {
      __r3953 = ((java.lang.Object)((clojure.core.IVecImpl)this).newPath(((java.lang.Object)((java.lang.Object)((clojure.core.VecNode)this.root).edit)), (int)RT.intCast(clojure.lang.Numbers.minus((long)level1, (long)clojure.lang.RT.intCast((long)5L))), ((java.lang.Object)tailnode3)));
     }
     __r3952 = __r3953;
    }
    __r3951 = __r3952;
   }
   Object node_to_insert8 = __r3951;
   clojure.lang.RT.aset((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)ret6).arr)), (int)clojure.lang.RT.intCast((long)subidx4), ((java.lang.Object)node_to_insert8));
   return ret6;
  }
 }
 public java.lang.Object arrayFor(int i1)  {
  Object __r3956 = null;
  boolean and__3966__auto__2 = clojure.lang.Numbers.lte((long)clojure.lang.RT.intCast((long)0L), (long)i1);
  Object __r3957;
  if (and__3966__auto__2) {
   __r3957 = clojure.lang.Numbers.lt((long)i1, (long)cnt);
  } else {
   __r3957 = and__3966__auto__2;
  }
  if ((java.lang.Boolean)__r3957) {
   if (clojure.lang.Numbers.gte((long)i1, (long)((clojure.core.IVecImpl)this).tailoff())) {
    return this.tail;
   } else {
    {
     Object node3 = this.root;
     long level4 = clojure.lang.RT.longCast((int)shift);
     while(true) {
      if (clojure.lang.Numbers.isZero((long)level4)) {
       return ((java.lang.Object)((clojure.core.VecNode)node3).arr);
      } else {
       java.lang.Object node3___aux = ((java.lang.Object)clojure.lang.RT.aget((java.lang.Object[])((java.lang.Object[])((java.lang.Object)((clojure.core.VecNode)node3).arr)), (int)clojure.lang.RT.intCast((long)clojure.lang.Numbers.and((long)clojure.lang.Numbers.shiftRight((long)i1, (long)level4), (long)clojure.lang.RT.intCast((long)31L)))));
       long level4___aux = clojure.lang.Numbers.minus((long)level4, (long)clojure.lang.RT.intCast((long)5L));
       node3 = node3___aux;
       level4 = level4___aux;
       continue;
      }
     }
    }
   }
  } else {
   Util.trow((Throwable)new java.lang.IndexOutOfBoundsException());
   return null;
  }
 }
 public int tailoff()  {
  return RT.intCast(clojure.lang.Numbers.minus((long)cnt, (long)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.tail))));
 }
 public clojure.lang.ISeq seq()  {
  if (clojure.lang.Numbers.isZero((long)cnt)) {
   return (clojure.lang.ISeq)null;
  } else {
   return (clojure.lang.ISeq)new clojure.core.VecSeq(((java.lang.Object)this.am), ((java.lang.Object)this), ((java.lang.Object)((java.lang.Object)((clojure.core.IVecImpl)this).arrayFor((int)RT.intCast(0L)))), (int)RT.intCast(0L), (int)RT.intCast(0L));
  }
 }
 public int hashCode()  {
  long hash1 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)1L));
  long i2 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
  while(true) {
   if (clojure.lang.Util.equiv((long)i2, (long)cnt)) {
    return RT.intCast(hash1);
   } else {
    Object val3 = ((java.lang.Object)((clojure.lang.Indexed)this).nth((int)RT.intCast(i2)));
    long hash1___aux = clojure.lang.Numbers.unchecked_int_add((int)clojure.lang.Numbers.unchecked_int_multiply((int)RT.intCast(31L), (int)RT.intCast(hash1)), (int)clojure.lang.Util.hash(((java.lang.Object)val3)));
    long i2___aux = clojure.lang.Numbers.inc((long)i2);
    hash1 = hash1___aux;
    i2 = i2___aux;
    continue;
   }
  }
 }
 public boolean equals(java.lang.Object o1)  {
  if (clojure.lang.Util.identical(((java.lang.Object)this), ((java.lang.Object)o1))) {
   return RT.booleanCast(Boolean.TRUE);
  } else {
   Object __r3964 = null;
   boolean or__3968__auto__2 = (o1 instanceof clojure.lang.IPersistentVector);
   Object __r3965;
   if (or__3968__auto__2) {
    __r3965 = or__3968__auto__2;
   } else {
    __r3965 = (o1 instanceof java.util.RandomAccess);
   }
   if ((java.lang.Boolean)__r3965) {
    {
     boolean and__3966__auto__3 = clojure.lang.Util.equiv((long)cnt, (long)clojure.lang.RT.count(((java.lang.Object)o1)));
     if (and__3966__auto__3) {
      {
       long i4 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
       while(true) {
        if (clojure.lang.Util.equiv((long)i4, (long)cnt)) {
         return RT.booleanCast(Boolean.TRUE);
        } else {
         if (((java.lang.Object)((java.lang.Object)((clojure.lang.Indexed)this).nth((int)RT.intCast(i4)))).equals(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)o1), (int)RT.intCast(i4)))))) {
          long i4___aux = clojure.lang.Numbers.inc((long)i4);
          i4 = i4___aux;
          continue;
         } else {
          Object __r3970 = const__23;
          if (__r3970 != null && !(__r3970 == Boolean.FALSE)) {
           return RT.booleanCast(Boolean.FALSE);
          } else {
           return RT.booleanCast(null);
          }
         }
        }
       }
      }
     } else {
      return RT.booleanCast((and__3966__auto__3 ? Boolean.TRUE : Boolean.FALSE));
     }
    }
   } else {
    Object __r3972 = null;
    boolean or__3968__auto__5 = (o1 instanceof clojure.lang.Sequential);
    Object __r3973;
    if (or__3968__auto__5) {
     __r3973 = or__3968__auto__5;
    } else {
     __r3973 = (o1 instanceof java.util.List);
    }
    if ((java.lang.Boolean)__r3973) {
     return RT.booleanCast((((java.lang.Object)((IFn)const__26.getRawRoot()).invoke(this)).equals(((java.lang.Object)((IFn)const__26.getRawRoot()).invoke(o1))) ? Boolean.TRUE : Boolean.FALSE));
    } else {
     Object __r3975 = const__23;
     if (__r3975 != null && !(__r3975 == Boolean.FALSE)) {
      return RT.booleanCast(Boolean.FALSE);
     } else {
      return RT.booleanCast(null);
     }
    }
   }
  }
 }
 public boolean retainAll(java.util.Collection c1)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
  return RT.booleanCast(null);
 }
 public boolean removeAll(java.util.Collection c1)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
  return RT.booleanCast(null);
 }
 public boolean remove(java.lang.Object o1)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
  return RT.booleanCast(null);
 }
 public void clear()  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
 }
 public boolean addAll(java.util.Collection c1)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
  return RT.booleanCast(null);
 }
 public boolean add(java.lang.Object o1)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
  return RT.booleanCast(null);
 }
 public int size()  {
  return cnt;
 }
 public java.lang.Object[] toArray(java.lang.Object[] arr1)  {
  if (clojure.lang.Numbers.gte((long)clojure.lang.RT.count(((java.lang.Object)arr1)), (long)cnt)) {
   {
    long n__4366__auto__2 = clojure.lang.RT.longCast((int)cnt);
    {
     long i3 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i3, (long)n__4366__auto__2)) {
       clojure.lang.RT.aset((java.lang.Object[])((java.lang.Object[])arr1), (int)clojure.lang.RT.intCast((long)i3), ((java.lang.Object)((java.lang.Object)((clojure.lang.Indexed)this).nth((int)RT.intCast(i3)))));
       long i3___aux = clojure.lang.Numbers.unchecked_inc((long)i3);
       i3 = i3___aux;
       continue;
      } else {
      }
      break;
     }
    }
   }
   return (java.lang.Object[])arr1;
  } else {
   return (java.lang.Object[])((IFn)const__47.getRawRoot()).invoke(const__48, this);
  }
 }
 public java.lang.Object[] toArray()  {
  return (java.lang.Object[])((IFn)const__47.getRawRoot()).invoke(const__48, this);
 }
 public boolean isEmpty()  {
  return clojure.lang.Numbers.isZero((long)cnt);
 }
 public boolean containsAll(java.util.Collection c1)  {
  return RT.booleanCast(((IFn)const__45.getRawRoot()).invoke(new clojure.core.Vec_fn__6180(this), c1));
 }
 public boolean contains(java.lang.Object o1)  {
  return clojure.lang.RT.booleanCast(((java.lang.Object)((IFn)const__44.getRawRoot()).invoke(new clojure.core.Vec_fn__6178(o1), this)));
 }
 public java.lang.Object set(int i1, java.lang.Object e2)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
  return null;
 }
 public java.lang.Object remove(int i1)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
  return null;
 }
 public boolean addAll(int i1, java.util.Collection c2)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
  return RT.booleanCast(null);
 }
 public void add(int i1, java.lang.Object o2)  {
  Util.trow((Throwable)new java.lang.UnsupportedOperationException());
 }
 public java.util.List subList(int a1, int z2)  {
  return (java.util.List)((IFn)const__42.getRawRoot()).invoke(this, Integer.valueOf(a1), Integer.valueOf(z2));
 }
 public java.util.ListIterator listIterator(int i1)  {
  {
   Object i2 = new java.util.concurrent.atomic.AtomicInteger((int)i1);
   return (java.util.ListIterator)((IObj)new clojure.core.Vec_reify__6176(i2, this, cnt)).withMeta(const__41);
  }
 }
 public java.util.ListIterator listIterator()  {
  return (java.util.ListIterator)((java.util.ListIterator)((java.util.List)this).listIterator((int)RT.intCast(0L)));
 }
 public int lastIndexOf(java.lang.Object o1)  {
  {
   long i2 = clojure.lang.Numbers.dec((long)cnt);
   while(true) {
    if (clojure.lang.Numbers.lt((long)i2, (long)0L)) {
     return RT.intCast(const__32);
    } else {
     if (clojure.lang.Util.equiv(((java.lang.Object)o1), ((java.lang.Object)((java.lang.Object)((clojure.lang.Indexed)this).nth((int)RT.intCast(i2)))))) {
      return RT.intCast(Numbers.num(i2));
     } else {
      Object __r3981 = const__23;
      if (__r3981 != null && !(__r3981 == Boolean.FALSE)) {
       long i2___aux = clojure.lang.Numbers.dec((long)i2);
       i2 = i2___aux;
       continue;
      } else {
       return RT.intCast(null);
      }
     }
    }
   }
  }
 }
 public int indexOf(java.lang.Object o1)  {
  {
   long i2 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.equiv((long)i2, (long)cnt)) {
     return RT.intCast(const__32);
    } else {
     if (clojure.lang.Util.equiv(((java.lang.Object)o1), ((java.lang.Object)((java.lang.Object)((clojure.lang.Indexed)this).nth((int)RT.intCast(i2)))))) {
      return RT.intCast(Numbers.num(i2));
     } else {
      Object __r3985 = const__23;
      if (__r3985 != null && !(__r3985 == Boolean.FALSE)) {
       long i2___aux = clojure.lang.Numbers.inc((long)i2);
       i2 = i2___aux;
       continue;
      } else {
       return RT.intCast(null);
      }
     }
    }
   }
  }
 }
 public java.lang.Object get(int i1)  {
  return ((java.lang.Object)((clojure.lang.Indexed)this).nth((int)i1));
 }
 public clojure.lang.IMapEntry entryAt(java.lang.Object k1)  {
  if (((clojure.lang.Associative)this).containsKey(((java.lang.Object)k1))) {
   return (clojure.lang.IMapEntry)new clojure.lang.MapEntry(((java.lang.Object)k1), ((java.lang.Object)((java.lang.Object)((clojure.lang.Indexed)this).nth((int)clojure.lang.RT.intCast(((java.lang.Object)k1))))));
  } else {
   return (clojure.lang.IMapEntry)null;
  }
 }
 public boolean containsKey(java.lang.Object k1)  {
  boolean and__3966__auto__2 = clojure.lang.Util.isInteger(((java.lang.Object)k1));
  if (and__3966__auto__2) {
   boolean and__3966__auto__3 = clojure.lang.Numbers.lte((long)0L, (long)clojure.lang.RT.intCast(((java.lang.Object)k1)));
   if (and__3966__auto__3) {
    return clojure.lang.Numbers.lt((long)clojure.lang.RT.intCast(((java.lang.Object)k1)), (long)cnt);
   } else {
    return and__3966__auto__3;
   }
  } else {
   return and__3966__auto__2;
  }
 }
 public clojure.lang.Associative assoc(java.lang.Object k1, java.lang.Object v2)  {
  if (clojure.lang.Util.isInteger(((java.lang.Object)k1))) {
   return (clojure.lang.Associative)((clojure.lang.IPersistentVector)((clojure.lang.IPersistentVector)this).assocN((int)RT.intCast(k1), ((java.lang.Object)v2)));
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)"Key must be integer")));
   return (clojure.lang.Associative)null;
  }
 }
 public java.util.Iterator iterator()  {
  {
   Object i1 = new java.util.concurrent.atomic.AtomicInteger((int)RT.intCast(0L));
   return (java.util.Iterator)((IObj)new clojure.core.Vec_reify__6174(i1, this, cnt)).withMeta(const__37);
  }
 }
 public int compareTo(java.lang.Object o1)  {
  if (clojure.lang.Util.identical(((java.lang.Object)this), ((java.lang.Object)o1))) {
   return RT.intCast(const__1);
  } else {
   {
    Object v2 = ((IFn)const__31.getRawRoot()).invoke(const__18, o1);
    int vcnt3 = ((clojure.lang.Counted)v2).count();
    if (clojure.lang.Numbers.lt((long)cnt, (long)vcnt3)) {
     return RT.intCast(const__32);
    } else {
     if (clojure.lang.Numbers.gt((long)cnt, (long)vcnt3)) {
      return RT.intCast(const__12);
     } else {
      Object __r3994 = const__23;
      if (__r3994 != null && !(__r3994 == Boolean.FALSE)) {
       {
        long i4 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
        while(true) {
         if (clojure.lang.Util.equiv((long)i4, (long)cnt)) {
          return RT.intCast(const__1);
         } else {
          {
           int comp5 = clojure.lang.Util.compare(((java.lang.Object)((java.lang.Object)((clojure.lang.Indexed)this).nth((int)RT.intCast(i4)))), ((java.lang.Object)((java.lang.Object)((clojure.lang.Indexed)v2).nth((int)RT.intCast(i4)))));
           if (clojure.lang.Util.equiv((long)0L, (long)comp5)) {
            long i4___aux = clojure.lang.Numbers.inc((long)i4);
            i4 = i4___aux;
            continue;
           } else {
            return RT.intCast(Integer.valueOf(comp5));
           }
          }
         }
        }
       }
      } else {
       return RT.intCast(null);
      }
     }
    }
   }
  }
 }
 public int count()  {
  return cnt;
 }
 public java.lang.Object nth(int i1, java.lang.Object not_found2)  {
  {
   int z3 = clojure.lang.RT.intCast((long)0L);
   Object __r3998 = null;
   boolean and__3966__auto__4 = clojure.lang.Numbers.gte((long)i1, (long)z3);
   Object __r3999;
   if (and__3966__auto__4) {
    __r3999 = clojure.lang.Numbers.lt((long)i1, (long)((clojure.lang.Counted)this).count());
   } else {
    __r3999 = and__3966__auto__4;
   }
   if ((java.lang.Boolean)__r3999) {
    return ((java.lang.Object)((clojure.lang.Indexed)this).nth((int)i1));
   } else {
    return not_found2;
   }
  }
 }
 public java.lang.Object nth(int i1)  {
  {
   Object a2 = ((java.lang.Object)((clojure.core.IVecImpl)this).arrayFor((int)i1));
   return ((java.lang.Object)((clojure.core.ArrayManager)this.am).aget(((java.lang.Object)a2), (int)RT.intCast(clojure.lang.Numbers.and((long)i1, (long)clojure.lang.RT.intCast((long)31L)))));
  }
 }
 public boolean equiv(java.lang.Object o1)  {
  Object __r4001 = null;
  boolean or__3968__auto__2 = (o1 instanceof clojure.lang.IPersistentVector);
  Object __r4002;
  if (or__3968__auto__2) {
   __r4002 = or__3968__auto__2;
  } else {
   __r4002 = (o1 instanceof java.util.RandomAccess);
  }
  if ((java.lang.Boolean)__r4002) {
   {
    boolean and__3966__auto__3 = clojure.lang.Util.equiv((long)cnt, (long)clojure.lang.RT.count(((java.lang.Object)o1)));
    if (and__3966__auto__3) {
     {
      long i4 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
      while(true) {
       if (clojure.lang.Util.equiv((long)i4, (long)cnt)) {
        return RT.booleanCast(Boolean.TRUE);
       } else {
        if (clojure.lang.Util.equiv(((java.lang.Object)((java.lang.Object)((clojure.lang.Indexed)this).nth((int)RT.intCast(i4)))), ((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)o1), (int)RT.intCast(i4)))))) {
         long i4___aux = clojure.lang.Numbers.inc((long)i4);
         i4 = i4___aux;
         continue;
        } else {
         Object __r4007 = const__23;
         if (__r4007 != null && !(__r4007 == Boolean.FALSE)) {
          return RT.booleanCast(Boolean.FALSE);
         } else {
          return RT.booleanCast(null);
         }
        }
       }
      }
     }
    } else {
     return RT.booleanCast((and__3966__auto__3 ? Boolean.TRUE : Boolean.FALSE));
    }
   }
  } else {
   Object __r4009 = null;
   boolean or__3968__auto__5 = (o1 instanceof clojure.lang.Sequential);
   Object __r4010;
   if (or__3968__auto__5) {
    __r4010 = or__3968__auto__5;
   } else {
    __r4010 = (o1 instanceof java.util.List);
   }
   if ((java.lang.Boolean)__r4010) {
    return RT.booleanCast((clojure.lang.Util.equiv(((java.lang.Object)((IFn)const__26.getRawRoot()).invoke(this)), ((java.lang.Object)((IFn)const__26.getRawRoot()).invoke(o1))) ? Boolean.TRUE : Boolean.FALSE));
   } else {
    Object __r4012 = const__23;
    if (__r4012 != null && !(__r4012 == Boolean.FALSE)) {
     return RT.booleanCast(Boolean.FALSE);
    } else {
     return RT.booleanCast(null);
    }
   }
  }
 }
 public clojure.lang.IPersistentCollection empty()  {
  return (clojure.lang.IPersistentCollection)new clojure.core.Vec(((java.lang.Object)this.am), (int)RT.intCast(0L), (int)RT.intCast(5L), ((java.lang.Object)const__16.getRawRoot()), ((java.lang.Object)((java.lang.Object)((clojure.core.ArrayManager)this.am).array((int)RT.intCast(0L)))), ((java.lang.Object)null));
 }
 public clojure.lang.IPersistentVector cons(java.lang.Object val1)  {
  if (clojure.lang.Numbers.lt((long)clojure.lang.Numbers.minus((long)cnt, (long)((clojure.core.IVecImpl)this).tailoff()), (long)clojure.lang.RT.intCast((long)32L))) {
   {
    Object new_tail2 = ((java.lang.Object)((clojure.core.ArrayManager)this.am).array((int)RT.intCast(clojure.lang.Numbers.inc((long)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.tail))))));
    java.lang.System.arraycopy(((java.lang.Object)this.tail), (int)RT.intCast(0L), ((java.lang.Object)new_tail2), (int)RT.intCast(0L), (int)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.tail)));
    ((clojure.core.ArrayManager)this.am).aset(((java.lang.Object)new_tail2), (int)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.tail)), ((java.lang.Object)val1));
    return (clojure.lang.IPersistentVector)new clojure.core.Vec(((java.lang.Object)this.am), (int)RT.intCast(clojure.lang.Numbers.inc((long)cnt)), (int)shift, ((java.lang.Object)this.root), ((java.lang.Object)new_tail2), ((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this)));
   }
  } else {
   {
    Object tail_node3 = new clojure.core.VecNode(((java.lang.Object)((java.lang.Object)((clojure.core.VecNode)this.root).edit)), ((java.lang.Object)this.tail));
    if (clojure.lang.Numbers.gt((long)clojure.lang.Numbers.shiftRight((long)cnt, (long)clojure.lang.RT.intCast((long)5L)), (long)clojure.lang.Numbers.shiftLeft((long)clojure.lang.RT.intCast((long)1L), (long)shift))) {
     {
      Object new_root4 = new clojure.core.VecNode(((java.lang.Object)((java.lang.Object)((clojure.core.VecNode)this.root).edit)), ((java.lang.Object)((java.lang.Object[])clojure.lang.RT.object_array(((java.lang.Object)const__6)))));
      {
       Object G__61735 = ((java.lang.Object)((clojure.core.VecNode)new_root4).arr);
       clojure.lang.RT.aset((java.lang.Object[])((java.lang.Object[])G__61735), (int)clojure.lang.RT.intCast((long)0L), ((java.lang.Object)this.root));
       clojure.lang.RT.aset((java.lang.Object[])((java.lang.Object[])G__61735), (int)clojure.lang.RT.intCast((long)1L), ((java.lang.Object)((java.lang.Object)((clojure.core.IVecImpl)this).newPath(((java.lang.Object)((java.lang.Object)((clojure.core.VecNode)this.root).edit)), (int)shift, ((java.lang.Object)tail_node3)))));
      }
      Object __r4015 = null;
      {
       Object tl6 = ((java.lang.Object)((clojure.core.ArrayManager)this.am).array((int)RT.intCast(1L)));
       ((clojure.core.ArrayManager)this.am).aset(((java.lang.Object)tl6), (int)RT.intCast(0L), ((java.lang.Object)val1));
       __r4015 = tl6;
      }
      return (clojure.lang.IPersistentVector)new clojure.core.Vec(((java.lang.Object)this.am), (int)RT.intCast(clojure.lang.Numbers.inc((long)cnt)), (int)RT.intCast(clojure.lang.Numbers.add((long)shift, (long)clojure.lang.RT.intCast((long)5L))), ((java.lang.Object)new_root4), ((java.lang.Object)__r4015), ((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this)));
     }
    } else {
     Object __r4016 = null;
     {
      Object tl7 = ((java.lang.Object)((clojure.core.ArrayManager)this.am).array((int)RT.intCast(1L)));
      ((clojure.core.ArrayManager)this.am).aset(((java.lang.Object)tl7), (int)RT.intCast(0L), ((java.lang.Object)val1));
      __r4016 = tl7;
     }
     return (clojure.lang.IPersistentVector)new clojure.core.Vec(((java.lang.Object)this.am), (int)RT.intCast(clojure.lang.Numbers.inc((long)cnt)), (int)shift, ((java.lang.Object)((java.lang.Object)((clojure.core.IVecImpl)this).pushTail((int)shift, (clojure.core.VecNode)((clojure.core.VecNode)this.root), (clojure.core.VecNode)((clojure.core.VecNode)tail_node3)))), ((java.lang.Object)__r4016), ((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this)));
    }
   }
  }
 }
 public clojure.lang.ISeq rseq()  {
  if (clojure.lang.Numbers.gt((long)((clojure.lang.Counted)this).count(), (long)0L)) {
   return (clojure.lang.ISeq)new clojure.lang.APersistentVector.RSeq((clojure.lang.IPersistentVector)((clojure.lang.IPersistentVector)this), (int)RT.intCast(clojure.lang.Numbers.dec((long)((clojure.lang.Counted)this).count())));
  } else {
   return (clojure.lang.ISeq)null;
  }
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16, java.lang.Object p17, java.lang.Object p18, java.lang.Object p19, java.lang.Object[] p20)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object call() throws java.lang.Exception {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16, java.lang.Object p17, java.lang.Object p18)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke()  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object applyTo(clojure.lang.ISeq p0)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16, java.lang.Object p17)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public void run()  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16, java.lang.Object p17, java.lang.Object p18, java.lang.Object p19)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public int length()  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16)  {
  throw new RuntimeException("Reify non implemented method");
 }
}
