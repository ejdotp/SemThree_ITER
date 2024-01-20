----------------------------------------------------------------------------------
-- Company: SOA
-- Engineer: E Jagadeeswar Patro
-- 
-- Create Date: 12/23/2023 01:17:01 PM
-- Design Name: 
-- Module Name: BinaryGrayConverter - dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;
-- E. Jagadeeswar Patro - 2241016309
entity BinaryGrayConverter is
    Port ( b1 : in STD_LOGIC;
           b2 : in STD_LOGIC;
           b3 : in STD_LOGIC;
           b4 : in STD_LOGIC;
           g1 : out STD_LOGIC;
           g2 : out STD_LOGIC;
           g3 : out STD_LOGIC;
           g4 : out STD_LOGIC);
end BinaryGrayConverter;

architecture dataflow of BinaryGrayConverter is

begin
g1 <= b2 xor b1;
g2 <= b3 xor b2;
g3 <= b4 xor b3;
g4 <= b4;
end dataflow;
